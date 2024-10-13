package com.util;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.api.pojo.LoginPOJO;
import com.constant.Env;
import com.constant.Role;
import com.google.gson.Gson;

public class TestUtility {
//Webdriver wd = new Chromedriver
	public static String toJson(Object object) {
		Gson gsonRef = new Gson();
		String data = gsonRef.toJson(object);
	
		return data;
	}

	public static String generateTokenFor(String role) {

		LoginPOJO loginPOJO = null;
		if (role.equalsIgnoreCase("fd")) {
			loginPOJO = new LoginPOJO("iamfd", "password");
		} else if (role.equalsIgnoreCase("sup")) {
			loginPOJO = new LoginPOJO("iamsup", "password");
		}

		else if (role.equalsIgnoreCase("eng")) {
			loginPOJO = new LoginPOJO("iameng", "password");
		}

		String authToken = given().baseUri("http://139.59.91.96:9000").and().header("Content-Type", "application/json")
				.and().body(toJson(loginPOJO)).when().post("v1/login").then().extract().path("data.token");
		return authToken;
	}

	public static String generateTokenFor(Role role) {

		LoginPOJO loginPOJO = null;
		if (role == Role.FD) {// Check
			loginPOJO = new LoginPOJO("iamfd", "password");
		}
		if (role == Role.SUP) {// Check

			loginPOJO = new LoginPOJO("iamsup", "password");
		}

		else if (role == Role.ENG) {// Check

			loginPOJO = new LoginPOJO("iameng", "password");
		}

		else if (role == Role.QC) {// Check

			loginPOJO = new LoginPOJO("iamqc", "password");
		}

		else if (role == Role.CC) {// Check

			loginPOJO = new LoginPOJO("iamcc2", "password");
		}
		String authToken = given().baseUri("http://139.59.91.96:9000").and().header("Content-Type", "application/json")
				.and().body(toJson(loginPOJO)).when().post("v1/login").then().extract().path("data.token");
		return authToken;
	}

	public static String getEnv(Env env, String prop) {
		// TODO Auto-generated method stub
		// Reading File!!!

		// WHere the file is present!!
		// File

		System.out.println(System.getProperty("user.dir"));
		File myfile = new File(System.getProperty("user.dir") + "//config//" + env + ".properties");
		Properties properties = new Properties();

		FileReader fileReader;
		try {
			fileReader = new FileReader(myfile);
			properties.load(fileReader);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // url
		String data = properties.getProperty(prop.toUpperCase());
		return data;
	}

}
