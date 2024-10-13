package com.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	private String name;
	private String gender;

	@JsonProperty(defaultValue = "18")
	private int age;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}
