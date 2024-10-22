package com.xworkz.food.runner;

public class DosaRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("this is driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
