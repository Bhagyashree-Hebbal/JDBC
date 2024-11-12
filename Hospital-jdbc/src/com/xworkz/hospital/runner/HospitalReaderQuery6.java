package com.xworkz.hospital.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hospital.constants.HospitalEnum;

public class HospitalReaderQuery6 {

	public static void main(String[] args) {

		String query6 = "SELECT hospital_name FROM hospital_table WHERE hospital_id>10";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(HospitalEnum.URL.getValue(), HospitalEnum.USERNAME.getValue(),
					HospitalEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query6);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("hospital_name"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
