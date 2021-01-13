//package actions
//
//import io.gatling.http.Predef._
//import io.gatling.core.Predef._
//
//object RetrieveToken {
//
//  val run = exec(http("[POST] Retrieve token")
//    .post("/api/v1/simulate/token")
//    //    .queryParam("key", apiKey)
//    .body(prepareJsonBody(
//      """
//        |{
//        |  "password": "admin",
//        |  "username": "admin"
//        |}
//        """))
//    .check(status.is(201),
//      jsonPath("$.subscriptionId").saveAs("sid")))
//}
