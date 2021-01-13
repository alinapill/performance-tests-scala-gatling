package shared

import io.gatling.core.feeder.Feeder
import io.gatling.http.Predef._

import scala.concurrent.duration.{FiniteDuration, MINUTES, SECONDS}
import scala.util.Random

class TestSettings {

  // *** General Settings ***
  val Common = new {
    val URL_GET_EMPLOYEES: String = System.getProperty("perfUrlGetEmployees", "https://qa-automation-practice.herokuapp.com/api/v1/employees/")
    val URL_GET_EMPLOYEES_THAT_REQUIRES_AUTH: String = System.getProperty("perfUrlGetEmployeesThatRequiresAuth", "simulate/get/employees")
    val BASE_URL_EMPLOYEES: String = System.getProperty("perfUrlGetEmployeesThatRequiresAuth", "https://qa-automation-practice.herokuapp.com/api/v1/")
//    Authorisation
//    Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwidXNlcm5hbWUiOiJhZG1pbiIsInBhc3N3b3JkIjoiYWRtaW4iLCJpYXQiOjE1MTYyMzkwMjJ9.ntESp11I8zjO1TCvg4YIkMf-s0q8JjI-_cu3monL02Q

    val URL_RETRIEVE_TOKEN: String = System.getProperty("perfUrlURetrieveAuthToken", "https://qa-automation-practice.herokuapp.com/api/v1/simulate/token/")
//    body:
//      {
//        "password": "admin",
//        "username": "admin"
//      }

    val MAX_DURATION: FiniteDuration = FiniteDuration(System.getProperty("perfMaxDuration", "1").toLong, MINUTES)
    val REQUESTS_SUCCESSFUL_PERCENTAGE: Double = System.getProperty("perfRequestSuccessfulPercentage", "99.0").toDouble
  }

  // *** General Assertion Settings ***
  val Employees = new {
    val Scenario = new {
      val INITIAL_LOAD: Int = System.getProperty("perfViewBasketInitialLoad", "1").toInt
      val MAX_LOAD: Int = System.getProperty("perfViewBasketMaxLoad", "2").toInt
      val RAMP_PERIOD: FiniteDuration = FiniteDuration(System.getProperty("perfViewBasketRampPeriod", "10").toLong, SECONDS)
      val SUSTAIN_PERIOD: FiniteDuration = FiniteDuration(System.getProperty("perfViewBasketSustainPeriod", "10").toLong, SECONDS)

      val AUTHENTICATE_REQUEST_WEIGHTING: Double = System.getProperty("perfFirstRequestWeighting", "30").toDouble
      val GET_EMPLOYEE_REQUEST_WEIGHTING: Double = System.getProperty("perfSecondRequestWeighting", "40").toDouble
      val UPDATE_EMPLOYEE_REQUEST_WEIGHTING: Double = System.getProperty("perfSecondRequestWeighting", "30").toDouble
    }
  }
}
