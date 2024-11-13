package com.xworkz.statements.constants;

public enum FoodOrderEnum {

	URL("jdbc:mysql://localhost:3306/food_jdbc"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private FoodOrderEnum(String value) {
		this.value = value;
		System.out.println("Value:" + value);
	}

	public String getValue() {
		return value;
	}

}
