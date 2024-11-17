package com.xworkz.ecommerce.constants;

public enum ProductEnum {

	URL("jdbc:mysql://localhost:3306/product_jdbc"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ProductEnum(String value) {
		this.value = value;
		System.out.println("Value:" + value);
	}

	public String getValue() {
		return value;
	}

}
