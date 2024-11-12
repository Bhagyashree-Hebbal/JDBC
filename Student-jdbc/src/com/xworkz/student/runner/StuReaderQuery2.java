package com.xworkz.student.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.student.constants.StudentEnum;

public class StuReaderQuery2 {

	public static void main(String[] args) {

		String query2 = "SELECT name FROM student_table WHERE email = 'ram.kumar@gmail.com' AND password = 'password789'";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(StudentEnum.URL.getValue(), StudentEnum.USERNAME.getValue(),StudentEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query2);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
