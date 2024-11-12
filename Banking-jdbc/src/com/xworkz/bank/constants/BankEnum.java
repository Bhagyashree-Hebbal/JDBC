package com.xworkz.bank.constants;

public enum BankEnum {

	URL("jdbc:mysql://localhost:3306/bank_jdbc"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private BankEnum(String value) {

		this.value = value;
		System.out.println("Value" + value);

	}

	public String getValue() {
		return value;
	}
}
