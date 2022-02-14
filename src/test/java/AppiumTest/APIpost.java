package AppiumTest;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class APIpost  {

public static void main(String[]args){

    //Given - all input details
    // when  - I submit the API request
    // then  - Validate the response
   RestAssured.baseURI = "https://rahulshettyacademy.com";
    // to get below methods add static to import io.restassured.RestAssured; and add * at last
  String postplace = given().queryParam("key","qaclick123").header("Content-Type","application/json")
          .body(payload.addname()).when().post("/maps/api/place/add/json")
          // below code .body aaset is for server check
          .then().assertThat().statusCode(200).body("scope",equalTo("APP")).header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();

System.out.println(postplace);
    JsonPath jp = new JsonPath(postplace);
    String placeid = jp.getString("place_id");

}
    }

