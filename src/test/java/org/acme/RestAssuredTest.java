package org.acme;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Tag("integration")
public class RestAssuredTest {
    @Test
    void checkOnBob() {
        given().
            port(8083).
        when().
            get("/payara-sandbox/greeting").
        then().
            log().all().
            body("greetings", equalTo("Bob"));
    }
}
