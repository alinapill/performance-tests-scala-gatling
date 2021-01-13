//package simulations
//
//import io.gatling.core.Predef._
//import io.gatling.core.structure.ScenarioBuilder
//import io.gatling.http.Predef._
//import shared.TestSettings
//
//class GetEmployeesSimulation extends Simulation {
//
//  val testSettings: TestSettings = new TestSettings()
//
//  val httpConfig = http
//    .baseUrl(testSettings.Common.URL_GET_EMPLOYEES)
//
//  val idsFeeder = csv("src/resources/ids.csv").random
//
//  val EmployeeScn: ScenarioBuilder = scenario("Employees | Get")
//    .feed(idsFeeder, 3)
//    .randomSwitch(
//      testSettings.Employees.Scenario.GET_EMPLOYEE_REQUEST_WEIGHTING -> exec(
//        http("get_specific_employee").get("${id1}")
//          .check(status.is(200))),
//      testSettings.Employees.Scenario.GET_EMPLOYEE_REQUEST_WEIGHTING -> exec(
//        http("get_all_employees").get("")
//          .check(status.is(200)))
//    )
//
//  setUp(
//    EmployeeScn.inject(
////      rampUsersPerSec(testSettings.Employees.Scenario.INITIAL_LOAD) to testSettings.Employees.Scenario.MAX_LOAD during testSettings.Employees.Scenario.RAMP_PERIOD,
//      constantUsersPerSec(testSettings.Employees.Scenario.MAX_LOAD) during testSettings.Employees.Scenario.SUSTAIN_PERIOD
//    )
//  ).maxDuration(testSettings.Common.MAX_DURATION)
//    .protocols(httpConfig)
//}
