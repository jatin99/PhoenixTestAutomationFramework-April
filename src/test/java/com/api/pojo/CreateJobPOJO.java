package com.api.pojo;

public class CreateJobPOJO {
	private int mst_service_location_id;
	private int mst_platform_id;
	private int mst_warrenty_status_id;
	private int mst_oem_id;
	private CustomerPOJO customer;//
	private CustomerAddressPOJO customer_address;
	private Customer_Product_POJO customer_product;
	private ProblemsPOJO[] problems;

	public CreateJobPOJO(int mst_service_location_id, int mst_platform_id, int mst_warrenty_status_id, int mst_oem_id,
			CustomerPOJO customer, CustomerAddressPOJO customer_address, Customer_Product_POJO customer_product,
			ProblemsPOJO[] problems) {
		super();
		this.mst_service_location_id = mst_service_location_id;
		this.mst_platform_id = mst_platform_id;
		this.mst_warrenty_status_id = mst_warrenty_status_id;
		this.mst_oem_id = mst_oem_id;
		this.customer = customer;
		this.customer_address = customer_address;
		this.customer_product = customer_product;
		this.problems = problems;
	}

}
