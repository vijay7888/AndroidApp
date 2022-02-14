package AppiumTest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;


public class APIGet {
   /* public static void main(String[]args){

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        given().log().all().queryParam("place_id","0dd5cb09aca849780a7324f032fe957a").queryParam("key","qaclick123")
                .when().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200)
                .header("server",equalTo("Apache/2.4.18 (Ubuntu)")).body("place_id", 0dd5cb09aca849780a7324f032fe957a);

    }*/
}
