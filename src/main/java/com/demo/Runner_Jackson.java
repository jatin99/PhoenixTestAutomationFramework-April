package com.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class Runner_Jackson {

	public static void main(String[] args) throws JsonProcessingException {

		LoginPOJO login = new LoginPOJO("iamfd", "password");
		//Java Object -----> JSON Object!!! JACKSON!!\
		
		ObjectMapper objectMapper = new ObjectMapper();
		String data=objectMapper.writeValueAsString(login);
		System.out.println(data);
			
//		Gson gsonRef = new Gson();
//		String dataJSON=gsonRef.toJson(login);
//		System.out.println(dataJSON);
		
		
	}
}
