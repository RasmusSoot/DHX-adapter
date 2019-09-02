package ee.ria.dhx


import io.qameta.allure.Step
import io.qameta.allure.restassured.AllureRestAssured
import io.restassured.RestAssured
import io.restassured.http.ContentType
import io.restassured.response.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class Steps {

    static Configuration conf


    @Autowired
    Steps(Configuration conf) {
        this.conf = conf
    }

    @Step("DHX-adapter Test /health request")
    static Response testHealthEndpoint() {
        return RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .filter(new AllureRestAssured())
                .when()
                .get(conf.test.getHealthUrl())
    }

    @Step("DHX-adapter Test /monitor request")
    static Response testMonitorEndpoint() {
        return RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .filter(new AllureRestAssured())
                .when()
                .get(conf.test.getMonitorUrl())
    }
}
