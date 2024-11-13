package com.xworkz.statements.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.statements.constants.ElectronicsEnum;

public class ElectronicsRunner {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prst = null;
		try {
			connection = DriverManager.getConnection(ElectronicsEnum.URL.getValue(),ElectronicsEnum.USERNAME.getValue(), ElectronicsEnum.PASSWORD.getValue());
			prst = connection.prepareStatement("insert into electro_table values(?,?,?)");
			prst.setInt(1, 1);
			prst.setString(2, "Television");
			prst.setString(3, "400000");

			prst.setInt(1, 2); 
			prst.setString(2, "Refrigerator"); 
			prst.setString(3, "50000");			
			
			prst.setInt(1, 3); 
			prst.setString(2, "Washing Machine"); 
			prst.setString(3, "35000");
			
			prst.setInt(1, 4); 
			prst.setString(2, "Microwave"); 
			prst.setString(3, "15000");
			
			prst.setInt(1, 5); 
			prst.setString(2, "Laptop"); 
			prst.setString(3, "80000");
			
			prst.setInt(1, 6); 
			prst.setString(2, "Smartphone"); 
			prst.setString(3, "60000");
			
			prst.setInt(1, 7); 
			prst.setString(2, "Tablet"); 
			prst.setString(3, "30000");
			
			prst.setInt(1, 8); 
			prst.setString(2, "Air Conditioner"); 
			prst.setString(3, "45000");
			
			prst.setInt(1, 9); 
			prst.setString(2, "Camera"); 
			prst.setString(3, "55000");
			
			prst.setInt(1, 10); 
			prst.setString(2, "Vacuum Cleaner"); 
			prst.setString(3, "20000");
			
			prst.setInt(1, 11); 
			prst.setString(2, "Smart Watch"); 
			prst.setString(3, "15000");
			
			prst.setInt(1, 12); 
			prst.setString(2, "Gaming Console"); 
			prst.setString(3, "40000"); 
			
			prst.setInt(1, 13); 
			prst.setString(2, "Headphones"); 
			prst.setString(3, "10000");
			
			prst.setInt(1, 14); 
			prst.setString(2, "Bluetooth Speaker"); 
			prst.setString(3, "12000");
			
			prst.setInt(1, 15); 
			prst.setString(2, "Fitness Tracker"); 
			prst.setString(3, "8000");
			
			int value = prst.executeUpdate();
			if (value > 0) {
				System.out.println("Saved");
			} else {
				System.out.println("Not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
