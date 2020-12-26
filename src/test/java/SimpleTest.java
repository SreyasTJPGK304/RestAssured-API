import io.restassured.RestAssured;
import org.junit.Test;

import javax.xml.ws.Response;

import static io.restassured.RestAssured.given;


public class SimpleTest {
    @Test
    public void test(){

        given().log().all().when().get("http://moolya.com").then().log().all();






    }




}
