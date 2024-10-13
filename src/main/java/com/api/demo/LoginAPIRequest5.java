//package com.api.demo;
//
//import static com.util1.TestUtility.*;
//import static io.restassured.RestAssured.*;
//
//import static org.hamcrest.Matchers.*;
//
//import java.io.IOException;
//
//import com.demo.LoginPOJO;
//import com.util1.Env;
//import com.util1.TestUtility;
//
//import io.restassured.module.jsv.JsonSchemaValidator;
//import io.restassured.response.Response;
//
//public class LoginAPIRequest5 {
//
//	public static void main(String[] args)  {
//		// TODO Auto-generated method stub
////		baseURI = "http://139.59.91.96:9000";
//		LoginPOJO loginPOJO = new LoginPOJO("iamsup", "password");
//		
//		
//			String data=	given()
//					.baseUri(TestUtility.getEnv(Env.QA, "URL"))
//				.and()
//					.header("Content-Type", "application/json")
//				.and()
//					.body(toJson(loginPOJO))
//					.log().all() //Log API Request 
//				.when()
//					.post("v1/login")
//				.then()
//					.log().all() // Logs The API response
//					.assertThat()
//					.statusCode(200)
//				.and()
//				.time(lessThan(1500L))
//				.and()
//				.body("message", equalTo("Success"))
//				.and()
//				.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/login-schema.json"))
//				.extract().path("data.token");
//			System.out.println(data);	
//	
//
//	}
//
//}
