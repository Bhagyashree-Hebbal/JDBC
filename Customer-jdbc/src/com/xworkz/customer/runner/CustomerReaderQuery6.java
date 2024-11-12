package com.xworkz.customer.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.customer.constants.CustomerEnum;

public class CustomerReaderQuery6 {

	public static void main(String[] args) {
		
		String query6 = "SELECT name FROM customer_table WHERE id>10";
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(CustomerEnum.URL.getValue(), CustomerEnum.USERNAME.getValue(),CustomerEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query6);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
