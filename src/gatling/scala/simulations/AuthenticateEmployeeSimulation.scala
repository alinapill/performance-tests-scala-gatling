package simulations

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import shared.TestSettings

class AuthenticateEmployeeSimulation extends Simulation {

  val testSettings: TestSettings = new TestSettings()

  val httpProtocol: HttpProtocolBuilder = http.baseUrl(testSettings.Common.BASE_URL_EMPLOYEES)

  val httpConfAuth = http
    .baseUrl(testSettings.Common.URL_GET_EMPLOYEES_THAT_REQUIRES_AUTH)
    .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwidXNlcm5hbWUiOiJhZG1pbiIsInBhc3N3b3JkIjoiYWRtaW4iLCJpYXQiOjE1MTYyMzkwMjJ9.ntESp11I8zjO1TCvg4YIkMf-s0q8JjI-_cu3monL02Q")

  val EmployeeScn: ScenarioBuilder = scenario("Employees | Authenticate")
    .randomSwitch(testSettings.Employees.Scenario.AUTHENTICATE_REQUEST_WEIGHTING -> exec(
      http("get_all_employees").get("")
        .check(status.is(200))),
      testSettings.Employees.Scenario.AUTHENTICATE_REQUEST_WEIGHTING -> exec(
        http("get_all_employees").get("")
          .check(status.is(200)))
    )

  setUp(
    EmployeeScn.inject(
      rampUsersPerSec(testSettings.Employees.Scenario.INITIAL_LOAD) to testSettings.Employees.Scenario.MAX_LOAD during testSettings.Employees.Scenario.RAMP_PERIOD,
      constantUsersPerSec(testSettings.Employees.Scenario.MAX_LOAD) during testSettings.Employees.Scenario.SUSTAIN_PERIOD
    )
  ).maxDuration(testSettings.Common.MAX_DURATION)
    .protocols(httpProtocol)
}
