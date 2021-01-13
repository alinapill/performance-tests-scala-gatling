package actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object UpdateEmployee {

  val run = exec(http("[POST] Update employee")
    .post("/employees/")
    .body(RawFileBody("src/resources/updateRequestBody.json"))
    .asJson
    .check(status.is(201)))
}
