package simulations

import actions.UpdateEmployee
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import shared.TestSettings

import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

class UpdateEmployeeAlternateSimulation extends Simulation {

  val testSettings: TestSettings = new TestSettings()

  val httpProtocol: HttpProtocolBuilder = http.baseUrl(testSettings.Common.BASE_URL_EMPLOYEES)

  val nameFeeder = csv("src/resources/names.csv").random

  val updateEmployeeScn = scenario("Update_Employee").feed(nameFeeder).exec(UpdateEmployee.run)

  /** Use of throttle */

  setUp(
    updateEmployeeScn.inject(constantUsersPerSec(10) during (1 minutes)))
    .throttle(
      //targets throughput with a ramp over given duration
      reachRps(10) in (10 seconds),
      holdFor(1 minute),
      jumpToRps(30),
      holdFor(20 minute)
    )
    .maxDuration(testSettings.Common.MAX_DURATION).assertions(
    global.successfulRequests.percent.gt(99),
    details("get_all_employees").responseTime.percentile4.lt(testSettings.Assertion.RESPONSE_99_PERCENTILE),
    details("get_all_employees").responseTime.percentile3.lt(testSettings.Assertion.RESPONSE_95_PERCENTILE),
    details("get_all_employees").responseTime.percentile2.lt(testSettings.Assertion.RESPONSE_75_PERCENTILE),
    details("get_all_employees").responseTime.percentile1.lt(testSettings.Assertion.RESPONSE_50_PERCENTILE))
    .protocols(httpProtocol)
}
