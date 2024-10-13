package com.util;

import java.util.Locale;

import com.api.pojo.CreateJobPOJO;
import com.api.pojo.CustomerAddressPOJO;
import com.api.pojo.CustomerPOJO;
import com.api.pojo.Customer_Product_POJO;
import com.api.pojo.ProblemsPOJO;
import com.github.javafaker.Faker;

public class FakerUtility {

	public static CreateJobPOJO createFakeCreateJobData() {
		Faker faker = new Faker(Locale.ENGLISH);
		CustomerPOJO customerPOJO = new CustomerPOJO(faker.name().firstName(), faker.name().lastName(),
				faker.phoneNumber().cellPhone(), "", faker.internet().emailAddress(), "");

		CustomerAddressPOJO customerAddressPOJO = new CustomerAddressPOJO(

				faker.address().buildingNumber(), faker.address().firstName(), faker.address().streetAddress(), "Demo",
				"432323", "400104", "India", "Maharashtra");

		String imei = faker.numerify("##############");
		Customer_Product_POJO customer_Product_POJO = new Customer_Product_POJO("2024-07-23T18:30:00.000Z", imei, imei,
				imei, "2024-07-23T18:30:00.000Z", 1, 1);

		// Array Object where each index will act as a reference
		ProblemsPOJO[] problems = new ProblemsPOJO[1];
		problems[0] = new ProblemsPOJO(3, "test");

		CreateJobPOJO createJobPOJO = new CreateJobPOJO(0, 2, 1, 1, customerPOJO, customerAddressPOJO,
				customer_Product_POJO, problems);

		return createJobPOJO;

	}
}
