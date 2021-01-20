package shared

import scala.concurrent.duration.{FiniteDuration, MINUTES, SECONDS}

class TestSettings {

  // *** General Settings ***
  val Common = new {
    val URL_GET_EMPLOYEES: String = System.getProperty("perfUrlGetEmployees", "https://qa-automation-practice.herokuapp.com/api/v1/employees/")
    val URL_GET_EMPLOYEES_THAT_REQUIRES_AUTH: String = System.getProperty("perfUrlGetEmployeesThatRequiresAuth", "simulate/get/employees")
    val BASE_URL_EMPLOYEES: String = System.getProperty("perfUrlGetEmployeesThatRequiresAuth", "https://qa-automation-practice.herokuapp.com/api/v1/")
    val URL_RETRIEVE_TOKEN: String = System.getProperty("perfUrlURetrieveAuthToken", "https://qa-automation-practice.herokuapp.com/api/v1/simulate/token/")

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

      val AUTHENTICATE_REQUEST_WEIGHTING: Double = System.getProperty("perfFirstRequestWeighting", "50").toDouble
      val GET_EMPLOYEE_REQUEST_WEIGHTING: Double = System.getProperty("perfSecondRequestWeighting", "50").toDouble
    }
  }

  val Assertion = new {
    val RESPONSE_99_PERCENTILE: Int = System.getProperty("perfPrices99Percentile", "11500").toInt
    val RESPONSE_95_PERCENTILE: Int = System.getProperty("perfPrices95Percentile", "11100").toInt
    val RESPONSE_75_PERCENTILE: Int = System.getProperty("perfPrices75Percentile", "7175").toInt
    val RESPONSE_50_PERCENTILE: Int = System.getProperty("perfPrices50Percentile", "5175").toInt
  }
}
