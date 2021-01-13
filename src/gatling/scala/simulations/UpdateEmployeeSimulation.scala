package simulations

import actions.UpdateEmployee
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import shared.Feeders.FeederRandomEmail
import shared.{Feeders, TestSettings}

class UpdateEmployeeSimulation extends Simulation {

  val testSettings: TestSettings = new TestSettings()

  val httpConfig = http
    .baseUrl(testSettings.Common.BASE_URL_EMPLOYEES)

  val updateEmployeeScn = scenario("Update_Employee")
    .feed(FeederRandomEmail)
    .exec(UpdateEmployee.run)

  //    val scnRandomSwitch = scenario("Random switching between requests")
  //      .feed(FeederRandomEmail)
  //      .randomSwitch(
  //        45.0 -> exec(UpdateEmployeeScn),
  //        45.0 -> exec(UpdateEmployeeScn),
  //        10.0 -> exec(UpdateEmployeeScn)
  //      )

  setUp(
    updateEmployeeScn.inject(
      //      rampUsersPerSec(testSettings.Employees.Scenario.INITIAL_LOAD) to testSettings.Employees.Scenario.MAX_LOAD during testSettings.Employees.Scenario.RAMP_PERIOD,
      constantUsersPerSec(testSettings.Employees.Scenario.MAX_LOAD) during testSettings.Employees.Scenario.SUSTAIN_PERIOD
    )
  ).maxDuration(testSettings.Common.MAX_DURATION)
    .protocols(httpConfig)
}
