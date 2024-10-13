package com.api.demo;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPIRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "http://139.59.91.96:9000";
		Header header = new Header("Content-Type", "application/json");
		String requestBody = "{\r\n"
				+ "    \"username\": \"iamfd\",\r\n"
				+ "    \"password\": \"password\"\r\n"
				+ "}";
		//Make a request!
		RequestSpecification requestSpecification=RestAssured.given();
		RequestSpecification requestSpecification2=requestSpecification.header(header);
		RequestSpecification requestSpecification3=requestSpecification2.body(requestBody);
		Response response=requestSpecification3.post("/v1/login");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		System.out.println(response.time());


	}
	
	

}
