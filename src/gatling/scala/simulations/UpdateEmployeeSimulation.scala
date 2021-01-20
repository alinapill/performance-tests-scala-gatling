package simulations

import actions.UpdateEmployee
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import shared.TestSettings

import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

class UpdateEmployeeSimulation extends Simulation {

  val testSettings: TestSettings = new TestSettings()

  val httpProtocol: HttpProtocolBuilder = http.baseUrl(testSettings.Common.BASE_URL_EMPLOYEES)

  val nameFeeder = csv("src/resources/names.csv").random

  val updateEmployeeScn = scenario("Update_Employee").feed(nameFeeder).exec(UpdateEmployee.run)

  /** Random switch between requests */
  val scnRandomSwitch: ScenarioBuilder = scenario("Random switching between requests").feed(nameFeeder).randomSwitch(
    45.0 -> exec(UpdateEmployee.run),
    45.0 -> exec(UpdateEmployee.run),
    10.0 -> exec(UpdateEmployee.run)
  )

  setUp(
    scnRandomSwitch.inject(
      rampUsersPerSec(testSettings.Employees.Scenario.INITIAL_LOAD) to testSettings.Employees.Scenario.MAX_LOAD during testSettings.Employees.Scenario.RAMP_PERIOD,
      constantUsersPerSec(testSettings.Employees.Scenario.MAX_LOAD) during testSettings.Employees.Scenario.SUSTAIN_PERIOD
    )
  ).maxDuration(testSettings.Common.MAX_DURATION)
    .protocols(httpProtocol)

}
