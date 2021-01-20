package actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object UpdateEmployee {

  val r = new scala.util.Random

  def orderRef() = r.nextInt(Integer.MAX_VALUE)

  val nameJson: String = orderRef() + "test"

  val run = exec(http("[POST] Update employee")
    .post("/employees/")
    //        .body(RawFileBody("src/resources/updateRequestBody.json"))
    .body(StringBody(
      s"""{
    "id": 1,
    "firstName": "${nameJson}",
    "lastName": "DummyLastName",
    "dob": "1994-10-10",
    "email": "test@test.ro"
  }
  """)).asJson
    .check(status.is(201)))
//    .check(status.gte(200))
//    .check(status.lt(200))
//    .check(status.in(404, 501)))
}
