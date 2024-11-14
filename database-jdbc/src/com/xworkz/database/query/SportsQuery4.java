package com.xworkz.database.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.database.constants.SportsEnum;

public class SportsQuery4 {

	public static void main(String[] args) {
		String query4 = "SELECT venue,coachName FROM sports_table where ranking=1 ";

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(SportsEnum.URL.getValue(), SportsEnum.USERNAME.getValue(),SportsEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query4);

			while (resultSet.next()) {
				System.out.println("Venue:-"+resultSet.getString("venue"));
				System.out.println("coachName:-"+resultSet.getString("coachName"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
