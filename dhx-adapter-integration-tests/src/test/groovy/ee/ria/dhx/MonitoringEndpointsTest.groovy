package ee.ria.dhx


import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer
import org.springframework.test.context.ContextConfiguration

import static org.hamcrest.Matchers.equalTo
import static org.hamcrest.Matchers.notNullValue

@ContextConfiguration(
        classes = [TestConfiguration.class],
        initializers = ConfigFileApplicationContextInitializer.class)
class MonitoringEndpointsTest extends Spec {

    def "/health endpoint returns UP"() {
        given: "/health endpoint returns 200, diskSpace and database information"
        Steps.testHealthEndpoint()
                .then().log().all().statusCode(200)
                .body("status", equalTo("UP"),
                        "diskSpace.status", equalTo("UP"),
                        "diskSpace.total", notNullValue(),
                        "diskSpace.free", notNullValue(),
                        "diskSpace.threshold", notNullValue(),
                        "db.status", equalTo("UP"),
                        "db.database", equalTo("PostgreSQL"),
                        "db.hello", equalTo(1))
    }

    def "/monitor endpoint returns UP"() {
        given: "/monitor request returns 200 and UP"
        Steps.testMonitorEndpoint()
                .then().log().all().statusCode(200)
                .body("status", equalTo("UP"))
    }

}
