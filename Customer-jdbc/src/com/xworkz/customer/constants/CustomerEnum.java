package com.xworkz.customer.constants;

public enum CustomerEnum {

	URL("jdbc:mysql://localhost:3306/customer_jdbc"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private CustomerEnum(String value) {

		this.value = value;
		System.out.println("Value" + value);

	}

	public String getValue() {
		return value;
	}
}
