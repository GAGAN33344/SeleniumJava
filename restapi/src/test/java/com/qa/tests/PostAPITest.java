package com.qa.tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.data.Users;

public class PostAPITest extends TestBase{
	TestBase testBase;
	String serviceURL;
	String apiURL;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpResponse;
	
	@BeforeMethod
	public void setUp(){
		testBase = new TestBase();
		serviceURL = prop.getProperty("URL");
		apiURL = prop.getProperty("serviceURL");
		
		url = serviceURL + apiURL;
	}
	
	@Test
	public void postAPITest() throws JsonGenerationException, JsonMappingException, IOException {
		restClient = new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type","application/json");
		
		//now we need Jackson Java API to converts Users.java(java object) class to Json format is known as marshaling.
		ObjectMapper mapper = new ObjectMapper();
		Users users = new Users("morpheus", "leader");//Expected users object
		
		//now covert user object to json and store it.
		mapper.writeValue(new File("D:\\JavaSeleniumGitRepo\\SeleniumJava\\restapi\\src\\main\\java\\com\\qa\\data\\users.json"), users);
		
		//Convert user object to json in String
		String usersJsonString = mapper.writeValueAsString(users);
		System.out.println(usersJsonString);

		closeableHttpResponse = restClient.post(url, usersJsonString, headerMap);//call the API

		//Validate Response from API :
		//a. Status Code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code is : " + statusCode);//it will get status code

		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_201, "Status code is not expected");

		//b.JSON String
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJSON = new JSONObject(responseString);//it will covert string to json format
		System.out.println("JSON Response from API : " + responseJSON);//it will give whole data that is stored in JSON

		// Convert json to java object is knows as unmarshaling. 
		Users usersResObj = mapper.readValue(responseString, Users.class);//Actual users object
		System.out.println(usersResObj);
		
		Assert.assertTrue(users.getName().equals(usersResObj.getName()));//Comparing for validation
		
		Assert.assertTrue(users.getJob().equals(usersResObj.getJob()));//Comparing for validation
		
		System.out.println(usersResObj.getId());
		System.out.println(usersResObj.getCreatedAt());
	}
}
