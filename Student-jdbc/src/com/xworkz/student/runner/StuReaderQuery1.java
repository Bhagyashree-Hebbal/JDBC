package com.xworkz.student.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.student.constants.StudentEnum;

public class StuReaderQuery1 {

	public static void main(String[] args) {
		String query1 = "select * from student_table";

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(StudentEnum.URL.getValue(), StudentEnum.USERNAME.getValue(),StudentEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query1);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
