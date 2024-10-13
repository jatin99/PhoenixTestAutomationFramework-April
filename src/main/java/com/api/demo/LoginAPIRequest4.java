//package com.api.demo;
//
//import static com.util1.TestUtility.*;
//import static io.restassured.RestAssured.*;
//
//import com.demo.LoginPOJO;
//
//import io.restassured.response.Response;
//
//public class LoginAPIRequest4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		baseURI = "http://139.59.91.96:9000";
//		LoginPOJO loginPOJO = new LoginPOJO("iamsup", "password");
//		
//		Response response = 
//				given()
//					.baseUri("http://139.59.91.96:9000")
//				.and()
//					.header("Content-Type", "application/json")
//				.and()
//					.body(toJson(loginPOJO))
//				.when()
//					.post("v1/login");
//
//		System.out.println(response.asPrettyString());
//
//	}
//
//}
