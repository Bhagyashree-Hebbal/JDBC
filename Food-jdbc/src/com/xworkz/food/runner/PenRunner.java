package com.xworkz.food.runner;

public class PenRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("this is Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
