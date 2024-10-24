package com.xworkz.employee.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/company_jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into emp_table values(20,'Tarun','BA')";
		

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
			if (value > 0) {
				System.out.println("this is saved");
			} else {
				System.out.println("this is not saved");
			}
			if (connection != null) {
				System.out.println("this is connected");
			} else {
				System.out.println("this is not connected");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
