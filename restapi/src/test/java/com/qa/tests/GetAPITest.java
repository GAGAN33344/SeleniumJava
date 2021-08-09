package com.qa.tests;

import java.io.IOException;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.util.TestUtil;

public class GetAPITest extends TestBase{
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
	
	@Test(priority=1)
	public void getAPITestWithoutHeaders() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		closeableHttpResponse = restClient.get(url);
		
        // Now i will fetch three types of data below from closeableHttpResponse object reference
		//a. Status Code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code is : " + statusCode);//it will get status code
		
		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not expected");

		//b.JSON String
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJSON = new JSONObject(responseString);//it will covert string to json format
		System.out.println("JSON Response from API : " + responseJSON);//it will give whole data that is stored in JSON

		//Single Value Assertion
		//per_page:
		String perPageValue = TestUtil.getValueByJPath(responseJSON, "/per_page");
		System.out.println("value of per page is : " + perPageValue);
		Assert.assertEquals(perPageValue,String.valueOf(6), "Page value is not expected");
		
		//Total:
		String totalValue = TestUtil.getValueByJPath(responseJSON, "/total");
		System.out.println("Total value is : " + totalValue);
		Assert.assertEquals(Integer.parseInt(totalValue),12, "Total value is not expected");
		
		//Get the value from JSON Array
		String lastName = TestUtil.getValueByJPath(responseJSON, "/data[0]/last_name");
		String id = TestUtil.getValueByJPath(responseJSON, "/data[0]/id");
		String avatar = TestUtil.getValueByJPath(responseJSON, "/data[0]/avatar");
		String firstName = TestUtil.getValueByJPath(responseJSON, "/data[0]/first_name");
		String emailID = TestUtil.getValueByJPath(responseJSON, "/data[0]/email");
		
		System.out.println("Last name is : " + lastName);
		System.out.println("Id is : " + id);
		System.out.println("Avatar is : " + avatar);
		System.out.println("First name is : " + firstName);
		System.out.println("Email ID is : " + emailID);
		
		Assert.assertEquals(lastName,"Bluth", "Last name is not expected");
		Assert.assertEquals(Integer.parseInt(id),1, "id is not expected");
		Assert.assertEquals(avatar,"https://reqres.in/img/faces/1-image.jpg", "Avatar is not expected");
		Assert.assertEquals(firstName,"George", "First name is not expected");
		Assert.assertEquals(emailID,"george.bluth@reqres.in", "Email id is not expected");
		
		//c. All Headers
		Header[] headersArray = closeableHttpResponse.getAllHeaders();//it will store all headers that will in form of key value pair

		//now i will use hashmap to store key, value pairs from header array
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for(Header header : headersArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println("Headers Array is : " + allHeaders); 
	}
	
	@Test(priority=2 )
	public void getAPITestWithHeaders() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type","application/json");
		closeableHttpResponse = restClient.get(url, headerMap);
		
        // Now i will fetch three types of data below from closeableHttpResponse object reference
		//a. Status Code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code is : " + statusCode);//it will get status code
		
		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not expected");

		//b.JSON String
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJSON = new JSONObject(responseString);//it will covert string to json format
		System.out.println("JSON Response from API : " + responseJSON);//it will give whole data that is stored in JSON

		//Single Value Assertion
		//per_page:
		String perPageValue = TestUtil.getValueByJPath(responseJSON, "/per_page");
		System.out.println("value of per page is : " + perPageValue);
		Assert.assertEquals(perPageValue,String.valueOf(6), "Page value is not expected");
		
		//Total:
		String totalValue = TestUtil.getValueByJPath(responseJSON, "/total");
		System.out.println("Total value is : " + totalValue);
		Assert.assertEquals(Integer.parseInt(totalValue),12, "Total value is not expected");
		
		//Get the value from JSON Array
		String lastName = TestUtil.getValueByJPath(responseJSON, "/data[0]/last_name");
		String id = TestUtil.getValueByJPath(responseJSON, "/data[0]/id");
		String avatar = TestUtil.getValueByJPath(responseJSON, "/data[0]/avatar");
		String firstName = TestUtil.getValueByJPath(responseJSON, "/data[0]/first_name");
		String emailID = TestUtil.getValueByJPath(responseJSON, "/data[0]/email");
		
		System.out.println("Last name is : " + lastName);
		System.out.println("Id is : " + id);
		System.out.println("Avatar is : " + avatar);
		System.out.println("First name is : " + firstName);
		System.out.println("Email ID is : " + emailID);
		
		Assert.assertEquals(lastName,"Bluth", "Last name is not expected");
		Assert.assertEquals(Integer.parseInt(id),1, "id is not expected");
		Assert.assertEquals(avatar,"https://reqres.in/img/faces/1-image.jpg", "Avatar is not expected");
		Assert.assertEquals(firstName,"George", "First name is not expected");
		Assert.assertEquals(emailID,"george.bluth@reqres.in", "Email id is not expected");
		
		//c. All Headers
		Header[] headersArray = closeableHttpResponse.getAllHeaders();//it will store all headers that will in form of key value pair

		//now i will use hashmap to store key, value pairs from header array
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for(Header header : headersArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println("Headers Array is : " + allHeaders); 
	}
}
