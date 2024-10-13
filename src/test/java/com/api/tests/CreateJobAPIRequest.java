package com.api.tests;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.pojo.CreateJobPOJO;
import com.api.pojo.CustomerAddressPOJO;
import com.api.pojo.CustomerPOJO;
import com.api.pojo.Customer_Product_POJO;
import com.api.pojo.ProblemsPOJO;
import static com.constant.Env.*;
import static com.constant.Role.*;

import com.util.FakerUtility;
import com.util.TestUtility;

import static io.restassured.RestAssured.*;


@Listeners({com.listeners.MyAPIListeners.class})
public class CreateJobAPIRequest {
	CreateJobPOJO createJobPOJO;

	@BeforeMethod(description = "it will create the POJO for the request payload")
	public void setup() {
		createJobPOJO = FakerUtility.createFakeCreateJobData();
	}

	@Test(description = "Test if FD is able to create the job via api", groups = { "api", "e2e", "smoke" })
	public void testCreateJobAPITest() {

		given().baseUri(TestUtility.getEnv(QA, "URL")).and().header("Content-type", "application/json").and()
				.header("Authorization", TestUtility.generateTokenFor(FD)).and().body(TestUtility.toJson(createJobPOJO))
				.when().log().all().post("/v1/job/create").then().log().all().and().assertThat().statusCode(200).and()
				.body("message", equalTo("Job created successfully. "));
	}
}
