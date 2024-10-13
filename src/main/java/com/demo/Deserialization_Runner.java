package com.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class Deserialization_Runner {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		String json = "{\"name\" : \"Sai\" , \"gender\": \"male\" }";
		
		//GSON:
		Gson gson = new Gson();
		Person person=gson.fromJson(json, Person.class);
		
		System.out.println(person);
		
		ObjectMapper mapper = new ObjectMapper();
		
		Person p1=mapper.readValue(json, Person.class);
		System.out.println(p1);
		
	}

}
