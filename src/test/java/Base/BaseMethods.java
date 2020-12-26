package Base;


import Utils.utils;

import static io.restassured.RestAssured.given;
public class BaseMethods {

    public static void getMethod() {
        given().baseUri(utils.URL()).log().all()
                .get("https://reqres.in/api/users/2").then().log().all();
    }

    public static void postMethod() {
        given().baseUri(utils.URL()).log().all()
                .body(utils.postdetails("Sreyas", "Software intern"))
                .post("https://reqres.in/api/users").then().log().all();

    }

    public static void postMethod1() {
        given().baseUri(utils.URL()).log().all()
                .body(utils.postdetails("Shridar", "Software intern"))
                .post("https://reqres.in/api/users").then().log().all();

    }
}



