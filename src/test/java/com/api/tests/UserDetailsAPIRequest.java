package com.api.tests;

import static com.util1.Role.*;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.constant.Env;
import com.constant.Role;

import static com.util.TestUtility.*;

@Listeners({ com.listeners.MyAPIListeners.class })
public class UserDetailsAPIRequest {

	@Test(description = "User Details API Test")
	public void userDetailsAPIRequestTest() {
//
		given().baseUri(getEnv(Env.QA, "URL")).and().header("Authorization", generateTokenFor(Role.FD)).when().log()
				.all().get("v1/userdetails").then().log().all().assertThat().statusCode(200).time(lessThan(1000L))
				.body("message", equalTo("Success")).and().body("data.id", equalTo(4));

	}

}
