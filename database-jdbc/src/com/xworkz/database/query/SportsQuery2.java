package com.xworkz.database.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.database.constants.SportsEnum;

public class SportsQuery2 {

	public static void main(String[] args) {
     String query2 = "SELECT teamName FROM sports_table WHERE playerName = 'Sunil Chhetri' AND score = '2'";
		
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(SportsEnum.URL.getValue(), SportsEnum.USERNAME.getValue(),SportsEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query2);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("teamName"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
