package com.xworkz.customer.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.customer.constants.CustomerEnum;

public class CustomerReaderQuery2 {

	public static void main(String[] args) {
		
		String query2 = "SELECT name FROM customer_table WHERE email = 'sunita@gmail.com' AND password = 'Sun1234'";
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(CustomerEnum.URL.getValue(), CustomerEnum.USERNAME.getValue(),CustomerEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query2);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
