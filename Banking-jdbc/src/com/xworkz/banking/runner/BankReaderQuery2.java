package com.xworkz.banking.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bank.constants.BankEnum;

public class BankReaderQuery2 {

	public static void main(String[] args) {
		
		String query2 = "SELECT account_holder_name FROM bank_table WHERE email = 'nisha@gmail.com' AND password = '871219'";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(BankEnum.URL.getValue(), BankEnum.USERNAME.getValue(),BankEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query2);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("account_holder_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
