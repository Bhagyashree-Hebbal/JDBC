package com.xworkz.banking.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bank.constants.BankEnum;

public class BankReaderQuery5 {

	public static void main(String[] args) {
		
		String query5 = "SELECT email ,password FROM bank_table where phone_number = 875486970 AND account_holder_name = 'Rohan'";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(BankEnum.URL.getValue(), BankEnum.USERNAME.getValue(),BankEnum.PASSWORD.getValue());
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
