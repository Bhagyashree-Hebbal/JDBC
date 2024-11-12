package com.xworkz.hospital.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hospital.constants.HospitalEnum;

public class HospitalReaderQuery5 {

	public static void main(String[] args) {
		String query5 = "SELECT email ,password FROM hospital_table where phone_number = 923456789 AND hospital_name = 'Hosmat'";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(HospitalEnum.URL.getValue(), HospitalEnum.USERNAME.getValue(),
					HospitalEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query5);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("email"));
				System.out.println(resultSet.getString("password"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
