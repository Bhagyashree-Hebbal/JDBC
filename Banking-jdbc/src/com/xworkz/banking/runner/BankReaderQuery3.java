package com.xworkz.banking.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bank.constants.BankEnum;

public class BankReaderQuery3 {

	public static void main(String[] args) {
		
		String query3 = "SELECT branch_address FROM bank_table WHERE account_holder_name = 'Priya' AND phone_number = 875486965";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(BankEnum.URL.getValue(), BankEnum.USERNAME.getValue(),BankEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query3);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("branch_address"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
