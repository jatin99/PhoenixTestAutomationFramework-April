package com.api.pojo;

import com.util.TestUtility;

public class Runner {
	public static void main(String[] args) {

		CustomerPOJO customerPOJO = new CustomerPOJO("Vibha", "V", "2435342324", "", "vibha@gmail.com", "");

		CustomerAddressPOJO customerAddressPOJO = new CustomerAddressPOJO("Test", "test", "Jupiter C-304 Vasant Galaxy",
				"Demo", "432323", "400104", "India", "Maharashtra");

		Customer_Product_POJO customer_Product_POJO = new Customer_Product_POJO("2024-07-23T18:30:00.000Z",
				"56732534343121", "56732534343121", "56732534343121", "2024-07-23T18:30:00.000Z", 1, 1);

		// Array Object where each index will act as a reference
		ProblemsPOJO[] problems = new ProblemsPOJO[1];
		problems[0] = new ProblemsPOJO(3, "test");

		CreateJobPOJO createJobPOJO = new CreateJobPOJO(0, 2, 1, 1, customerPOJO, customerAddressPOJO,
				customer_Product_POJO, problems);
		String data = TestUtility.toJson(createJobPOJO);
		System.out.println(data);
	}
}