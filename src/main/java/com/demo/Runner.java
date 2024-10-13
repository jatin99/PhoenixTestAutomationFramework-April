package com.demo;

import com.google.gson.Gson;

public class Runner {

	
	public static void main(String[] args) {
//		LoginPOJO fdLogin = new LoginPOJO("iamfd", "password");
//		Gson gsonRef = new Gson();
//		String data=gsonRef.toJson(fdLogin);
//		System.out.println(fdLogin);
//		System.out.println(data);
		
		
		String jsonString = "{\"userName\":\"iamsup\",\"password\":\"password123\"}";
		Gson gsonRef = new Gson();
		LoginPOJO login=gsonRef.fromJson(jsonString, LoginPOJO.class);
		System.out.println(login.getUserName());
		System.out.println(login.getPassword());

	}
}
