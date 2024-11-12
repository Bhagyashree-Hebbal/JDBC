package com.xworkz.hospital.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hospital.constants.HospitalEnum;

public class HospitalReaderQuery3 {

	public static void main(String[] args) {
		
		String query3 = "SELECT address FROM hospital_table WHERE hospital_name = 'Fortis' AND phone_number = 912345678";
		
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(HospitalEnum.URL.getValue(), HospitalEnum.USERNAME.getValue(),HospitalEnum.PASSWORD.getValue());
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
