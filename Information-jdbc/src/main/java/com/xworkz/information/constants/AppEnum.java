package com.xworkz.information.constants;

public enum AppEnum {

	URL("jdbc:mysql://localhost:3306/app_jdbc"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private String value;

	private AppEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
