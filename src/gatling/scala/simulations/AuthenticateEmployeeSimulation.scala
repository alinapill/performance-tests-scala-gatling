//package simulations
//
//import io.gatling.core.Predef._
//import io.gatling.core.structure.ScenarioBuilder
//import io.gatling.http.Predef._
//import shared.TestSettings
//
//class AuthenticateEmployeeSimulation extends Simulation {
//
//  val testSettings: TestSettings = new TestSettings()
//
//  private var token: String = ""
//
////  val auth = scenario("Retrieve Token")
////    .exec(
////      http("POST Auth Req")
////        .post(testSettings.Common.URL_GET_EMPLOYEES_THAT_REQUIRES_AUTH)
////        .body(ElFileBody("src/resources/authBody.json")).asJson
////        .check(bodyString.saveAs("Auth_Response"))
////        .check(status.is(200))
////        .check(jsonPath("$.token").find.saveAs("bearerToken")))
////    .exec{session => { token = session("bearerToken").as[String]
////      session}}
//
//  val httpConfig = http
//    .baseUrl(testSettings.Common.URL_GET_EMPLOYEES)
//
////  val httpConfAuth = http
////    .baseUrl(testSettings.Common.URL_GET_EMPLOYEES_THAT_REQUIRES_AUTH)
////    .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwidXNlcm5hbWUiOiJhZG1pbiIsInBhc3N3b3JkIjoiYWRtaW4iLCJpYXQiOjE1MTYyMzkwMjJ9.ntESp11I8zjO1TCvg4YIkMf-s0q8JjI-_cu3monL02Q")
//
//  val idsFeeder = csv("src/resources/ids.csv").random
//
//  val EmployeeScn: ScenarioBuilder = scenario("Employees | Get")
//    .feed(idsFeeder, 3)
//    .randomSwitch(
////      testSettings.Employees.Scenario.AUTHENTICATE_REQUEST_WEIGHTING -> exec(
////        http("get_employee0_id").get("/endpoint?id=${ID}&key=")
////          .check(status.is(200))),
//      testSettings.Employees.Scenario.GET_EMPLOYEE_REQUEST_WEIGHTING -> exec(
//        http("get_specific_employee").get("${id1}")
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
