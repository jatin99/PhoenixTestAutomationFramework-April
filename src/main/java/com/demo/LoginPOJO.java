package com.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginPOJO {

	@JsonProperty("Fname")
	private String username;
	
	@JsonProperty("pass")
	private String password;

	public LoginPOJO(String userName, String password) {
		super();
		//VALIDATION LOGIC
		this.username = userName;
		this.password = password;
	}

	public String getUserName() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "LoginPOJO [userName=" + username + ", password=" + password + "]";
	}
	
	

}
