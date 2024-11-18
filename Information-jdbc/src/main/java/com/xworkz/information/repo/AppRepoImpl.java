package com.xworkz.information.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.information.constants.AppEnum;
import com.xworkz.information.dto.AppDTO;

public class AppRepoImpl implements AppRepo {

	@Override
	public boolean save(AppDTO appDTO) {

		boolean isValid = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			Connection connection = null;

			connection = DriverManager.getConnection(AppEnum.URL.getValue(), AppEnum.USERNAME.getValue(),AppEnum.PASSWORD.getValue());

			PreparedStatement prest = null;

			prest = connection.prepareStatement("INSERT INTO app_table(name,lastName,email,address,phoneNo,age) values(?,?,?,?,?,?)");

			prest.setString(1, appDTO.getName());
			prest.setString(2, appDTO.getLastName());
			prest.setString(3, appDTO.getEmail());
			prest.setString(4, appDTO.getAddress());
			prest.setString(5, appDTO.getPhoneNo());
			prest.setInt(6, appDTO.getAge());

			int value = prest.executeUpdate();
			if (value > 0) {
				System.out.println("Data is saved");
				isValid = true;
			} else {
				System.out.println("Data is not saved");
				isValid = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValid;
	}
}
