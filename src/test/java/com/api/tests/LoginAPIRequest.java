package com.api.tests;

import static com.util.TestUtility.toJson;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.pojo.LoginPOJO;
import com.listeners.MyAPIListeners;
import com.util.JSONUtility;

import io.restassured.module.jsv.JsonSchemaValidator;

@Listeners({ MyAPIListeners.class })

public class LoginAPIRequest {
	private LoginPOJO loginPOJO;
	private String url;

	@BeforeMethod(description = "Creates the Login Request POJO")
	public void setup() throws FileNotFoundException {
		loginPOJO = new LoginPOJO("iamsup", "password");
		url = JSONUtility.readJSONConfig("qa").getUrl();
	}

	@Test(description = "Test Login API Request using FD Creds", groups = { "api", "regression" })
	public void LoginAPITest() {

		given().baseUri(url).and().header("Content-Type", "application/json").and().body(toJson(loginPOJO)).log().all() // Log
																														// API
																														// Request
				.when().post("v1/login").then().log().all() // Logs The API response
				.assertThat().statusCode(200).and().time(lessThan(100L)).and().body("message", equalTo("Success")).and()
				.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/login-schema.json"));

	}

}
