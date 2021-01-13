# performance-tests

**Performance Tests Suite**


Performance test automation framework is used to check statistics in an API functionality under high loads.

Tests are written in Scala & they are using Gatling for http interaction.


**Execution**

To run performance tests on local-machine against a targeted environment, use next command:

`./gradlew gatlingRun`

[comment]: <> (Performance tests can be also triggered manually through the git pipeline.	)


**Implementation Details**

The performance tests are calling TBD endpoint with both single and multiple skuIds GET requests.

The tests are defined as following:

We ramp up to 110 requests over a period of 4 minutes. 


Available simulation properties:

**General Settings**

`URL_UNDER_TEST` –  endpoint (base URL for all HTTP calls)

`MAX_DURATION` - 10 minutes (maximum duration of the simulation)

`PAUSE_BETWEEN_REQUESTS_SECS` - 1 second (duration of the pause between requests)


 **General Assertion Settings**
 
 `REQUESTS_SUCCESSFUL_PERCENTAGE` - 99.9 (percentage of successful requests under test)
 
 `INITIAL_LOAD` - 1 (initial number of requests)
 
 `MAX_LOAD` - 110 (maximum number of requests)
 
 `RAMP_PERIOD_MINS` - 4 minutes (ramp up period in minutes)
 
 `SUSTAIN_PERIOD_MINS` - 1 minute (sustain period in minutes)

   
**Percentiles**

Our current requirements for response times split by percentiles, as follows:

```
RESPONSE_99_PERCENTILE: 2500

RESPONSE_95_PERCENTILE: 100

RESPONSE_75_PERCENTILE: 100

RESPONSE_50_PERCENTILE: 100
```


**Reporting**
Reports are available after ending simulation by auto-generated link when running the tests locally. 

[comment]: <> (No gatling reports are generated when running the tests through the git pipeline.)