package com.xworkz.student.constants;

public enum StudentEnum {

	URL("jdbc:mysql://localhost:3306/student_jdbc"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private final String value;
	
	private StudentEnum(String value) {
		
		this.value=value;
		System.out.println("Value"+value);
		
	}

	public String getValue() {
		return value;
	}
	
}
