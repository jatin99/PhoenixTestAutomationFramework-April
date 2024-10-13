package com.api.pojo;

public class CustomerPOJO {
	private String first_name;
	private String last_name;
	private String mobile_number;
	private String mobile_number_alt;
	private String email_id;
	private String email_id_alt;
	public CustomerPOJO(String first_name, String last_name, String mobile_number, String mobile_number_alt,
			String email_id, String email_id_alt) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_number = mobile_number;
		this.mobile_number_alt = mobile_number_alt;
		this.email_id = email_id;
		this.email_id_alt = email_id_alt;
	}
	
	
}
