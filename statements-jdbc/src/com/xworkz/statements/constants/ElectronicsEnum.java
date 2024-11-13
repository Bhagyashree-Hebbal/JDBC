package com.xworkz.statements.constants;

public enum ElectronicsEnum {

	URL("jdbc:mysql://localhost:3306/electro_jdbc"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ElectronicsEnum(String value) {
		this.value = value;
		System.out.println("Value:" + value);
	}

	public String getValue() {
		return value;
	}

}
