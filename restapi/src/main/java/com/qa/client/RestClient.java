package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	//1. GET Method
	public void get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();//this method will help to create a one client connection
		HttpGet httpGet = new HttpGet(url);//http get request
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);//it will return response and store in closeHttpResponse object 
		
		//a. Status Code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code is : " + statusCode);//it will get status code
		
		//b.JSON String
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		
		JSONObject responseJSON = new JSONObject(responseString);//it will covert string to json format
		System.out.println("JSON Response from API : " + responseJSON);//it will give whole data that is stored in JSON
		
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
