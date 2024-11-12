package com.xworkz.customer.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.customer.constants.CustomerEnum;

public class CustomerReaderQuery3 {

	public static void main(String[] args) {
		
		String query3 = "SELECT address FROM customer_table WHERE name = 'Sneha' AND phone_no = 3987654321";
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(CustomerEnum.URL.getValue(), CustomerEnum.USERNAME.getValue(),CustomerEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query3);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("address"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
