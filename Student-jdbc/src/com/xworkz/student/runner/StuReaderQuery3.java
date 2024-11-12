package com.xworkz.student.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.student.constants.StudentEnum;

public class StuReaderQuery3 {

	public static void main(String[] args) {
		
		String query3 = "SELECT address FROM student_table WHERE name = 'Priya' AND phone_no = 432108765";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(StudentEnum.URL.getValue(), StudentEnum.USERNAME.getValue(),StudentEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query3);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("address"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
