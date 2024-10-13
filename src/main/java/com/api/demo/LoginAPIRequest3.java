//package com.api.demo;
//
//import static com.util1.TestUtility.*;
//import static io.restassured.RestAssured.baseURI;
//import static io.restassured.RestAssured.given;
//
//import com.demo.LoginPOJO;
//
//import io.restassured.response.Response;
//
//public class LoginAPIRequest3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		baseURI = "http://139.59.91.96:9000";
//		LoginPOJO loginPOJO = new LoginPOJO("iamsup", "password");
//		
////		Response response = given().header("Content-Type", "application/json")
////				.body(toJson(loginPOJO))
////				.post("v1/login");
//
//		System.out.println(response.asPrettyString());
//
//	}
//
//}
