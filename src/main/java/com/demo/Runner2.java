package com.demo;

import com.google.gson.Gson;

public class Runner2 {

	public static void main(String[] args) {

		String jsonString = "{\r\n" + "    \"status\": 500,\r\n"
				+ "    \"message\": \"Job is already open for this imei number\",\r\n"
				+ "    \"name\": \"APIError\",\r\n" + "    \"isPublic\": false,\r\n" + "    \"isOperational\": true\r\n"
				+ "}";
		Gson gsonRef = new Gson();
		CreateJobResponse createJobResponse = gsonRef.fromJson(jsonString, CreateJobResponse.class);
		System.out.println(createJobResponse.getName());
		System.out.println(createJobResponse);


	}
}
