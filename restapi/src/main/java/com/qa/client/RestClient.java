package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {
	
	//1. GET Method without headers
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();//this method will help to create a one client connection
		HttpGet httpGet = new HttpGet(url);//http get request
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);//it will return response and store in closeHttpResponse object 

		return closeableHttpResponse;
	}

	//2. GET Method with headers
	public CloseableHttpResponse get(String url, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();//this method will help to create a one client connection
		HttpGet httpGet = new HttpGet(url);//http get request with url
		
		for(Map.Entry<String, String> entry : headerMap.entrySet()) {//http get request with header
			httpGet.addHeader(entry.getKey(), entry.getValue());
		}
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);//it will return response and store in closeHttpResponse object 
		return closeableHttpResponse;
	}

}
