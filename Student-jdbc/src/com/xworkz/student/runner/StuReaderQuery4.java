package com.xworkz.student.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.student.constants.StudentEnum;

public class StuReaderQuery4 {

	public static void main(String[] args) {

		String query4 = "SELECT email,password FROM student_table where phone_no=109765432 ";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(StudentEnum.URL.getValue(), StudentEnum.USERNAME.getValue(),StudentEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query4);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("email"));
				System.out.println(resultSet.getString("password"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
