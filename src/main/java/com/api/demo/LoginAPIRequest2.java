package com.api.demo;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class LoginAPIRequest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseURI = "http://139.59.91.96:9000";
		Response response = given().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"username\": \"iamfd\",\r\n" + "    \"password\": \"password\"\r\n" + "}")
				.post("v1/login");

		System.out.println(response.asPrettyString());

	}

}
