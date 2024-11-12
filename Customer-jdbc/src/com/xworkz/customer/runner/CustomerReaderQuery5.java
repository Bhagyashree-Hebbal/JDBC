package com.xworkz.customer.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.customer.constants.CustomerEnum;

public class CustomerReaderQuery5 {

	public static void main(String[] args) {
		
		String query5 = "SELECT email ,password FROM customer_table where phone_no = 5987654321 AND name = 'Meera'";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(CustomerEnum.URL.getValue(), CustomerEnum.USERNAME.getValue(),CustomerEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query5);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("email"));
				System.out.println(resultSet.getString("password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
