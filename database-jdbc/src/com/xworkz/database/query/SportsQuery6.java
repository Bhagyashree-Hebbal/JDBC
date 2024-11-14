package com.xworkz.database.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.database.constants.SportsEnum;

public class SportsQuery6 {

	public static void main(String[] args) {
		String query6 = "SELECT coachName FROM sports_table WHERE teamId>5";

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(SportsEnum.URL.getValue(), SportsEnum.USERNAME.getValue(),SportsEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query6);

			while (resultSet.next()) {
				System.out.println("coachName:-"+resultSet.getString("coachName"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
