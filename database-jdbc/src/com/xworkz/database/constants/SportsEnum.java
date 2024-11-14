package com.xworkz.database.constants;

public enum SportsEnum {

	URL("jdbc:mysql://localhost:3306/sports_jdbc"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private SportsEnum(String value) {
		this.value = value;
		System.out.println("Value:" + value);
	}

	public String getValue() {
		return value;
	}
}
