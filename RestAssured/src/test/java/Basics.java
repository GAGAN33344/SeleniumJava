import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import data.payload;


public class Basics {

	public static void main(String[] args) {

		//Rest-Assured works on three principals--> 
		//Given- all inputs details
		//When- Submit the API --> resource, http method
		//Then- Validate the response
		//delibrately we have to add Static RestAssured Package for given, when and then also have to add
		//static hamcrest package for equalTo method.
		//log().all() works to show logs

		//Add Place--> Update Place with New Address --> Get Place to Validate if New Address is present or not in
		//response.

		//Validate if Add Place API is working as expected after that will store json body as string in response variable
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(payload.AddPlace()).when().post("/maps/api/place/add/json")
				.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
				.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();

		System.out.println(response);//this response variable have jason body as string.

		//parsing the json, now js object reference have json body in json format from string
		JsonPath js = new JsonPath(response);
		String placeID = js.getString("place_id");//now we have place id

		System.out.println(placeID);

		//Update Place address with help of Place ID
		String newAddress = "70 Summer walk, USA";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"place_id\":\"" +placeID + "\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}")
		.when().put("/maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));

		//verify address is updated or not by using Get API
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeID)
				.when().get("/maps/api/place/get/json")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();

		//parsing the json, now js object reference have json body in json format from string
		JsonPath jp =new JsonPath(getPlaceResponse);
		String actualAddress = jp.getString("address");//now we have Address 

		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress,newAddress);

	}
}
