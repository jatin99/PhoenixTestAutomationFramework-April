//package com.api.demo;
//
//import static com.constant.Role.*;
//import static io.restassured.RestAssured.*;
//
//import static org.hamcrest.Matchers.*;
//
//import com.constant.Env;
//import com.util.TestUtility;
//
//public class UserDetailsAPIRequest {
//
//	public static void main(String[] args) {
////
//		given()
//		.baseUri(TestUtility.getEnv(Env., "URL"))
//		.and()
//		.header("Authorization", TestUtility.generateTokenFor(FD))
//		.when()
//		.log().all()
//		.get("v1/userdetails")
//		.then()
//		.log().all()
//		.assertThat()
//		.statusCode(200)
//		.time(lessThan(1000L))
//		.body("message", equalTo("Success"))
//		.and()
//		.body("data.id", equalTo(4));
//		
//	}
//
//}
