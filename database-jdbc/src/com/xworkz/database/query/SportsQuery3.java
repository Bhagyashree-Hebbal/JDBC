package com.xworkz.database.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.database.constants.SportsEnum;

public class SportsQuery3 {

	public static void main(String[] args) {
		String query3 = "SELECT sportType FROM sports_table WHERE teamName = 'Tennis Team' AND ranking = 2";

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(SportsEnum.URL.getValue(), SportsEnum.USERNAME.getValue(),SportsEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query3);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("sportType"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
