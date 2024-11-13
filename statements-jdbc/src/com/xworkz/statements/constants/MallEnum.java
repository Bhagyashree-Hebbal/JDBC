package com.xworkz.statements.constants;

public enum MallEnum {

	URL("jdbc:mysql://localhost:3306/mall_jdbc"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private MallEnum(String value) {
		this.value = value;
		System.out.println("Value:" + value);
	}

	public String getValue() {
		return value;
	}

}
