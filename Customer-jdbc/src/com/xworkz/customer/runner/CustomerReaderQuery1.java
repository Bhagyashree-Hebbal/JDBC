package com.xworkz.customer.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.customer.constants.CustomerEnum;


public class CustomerReaderQuery1 {

	public static void main(String[] args) {
		String query1 = "select * from customer_table";

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(CustomerEnum.URL.getValue(), CustomerEnum.USERNAME.getValue(),CustomerEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query1);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
