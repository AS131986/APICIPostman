import org.junit.jupiter.api.Test;
import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.filter.log.LogDetail;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class TestPost {
    @Test
    void TestPostman() {
                given()
                .baseUri("https://postman-echo.com")
                .body("car")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("cars"))
        ;
    }
}