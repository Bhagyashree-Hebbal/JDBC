package com.xworkz.hospital.constants;

public enum HospitalEnum {

	URL("jdbc:mysql://localhost:3306/hospital_jdbc"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private HospitalEnum(String value) {

		this.value = value;
		System.out.println("Value" + value);

	}

	public String getValue() {
		return value;
	}

}
