package com.xworkz.customer.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.customer.constants.CustomerEnum;

public class CustomerRunner {

	public static void main(String[] args) {

		String insertQuery = "insert into customer_table (id, name, email, password, phone_no, address, city, state, country,product) values(1,'Sruti','sruti@gmail.com','Sru1234',87546912,'Whitefiled','Bangalore','Karntaka','India','Television'),"
				+ "(2, 'Raj', 'raj@gmail.com', 'Raj1234', 9876543210, 'MG Road', 'Bangalore', 'Karnataka', 'India', 'Refrigerator'),"
				+ "(3, 'Sita', 'sita@gmail.com', 'Sit1234', 8765432109, 'Karve Road', 'Pune', 'Maharashtra', 'India', 'Washing Machine'),"
				+ "(4, 'Ram', 'ram@gmail.com', 'Ram1234', 7654321098, 'Brigade Road', 'Chennai', 'Tamil Nadu', 'India', 'Microwave'), "
				+ "(5, 'Gita', 'gita@gmail.com', 'Git1234', 6543210987, 'Lajpat Nagar', 'Delhi', 'Delhi', 'India', 'Laptop'), "
				+ "(6, 'Amit', 'amit@gmail.com', 'Ami1234', 5432109876, 'MG Road', 'Mumbai', 'Maharashtra', 'India', 'Smartphone'),"
				+ "(7, 'Priya', 'priya@gmail.com', 'Pri1234', 4321098765, 'Sector 17', 'Chandigarh', 'Punjab', 'India', 'Tablet'), "
				+ "(8, 'Anil', 'anil@gmail.com', 'Ani1234', 3210987654, 'Ring Road', 'Ahmedabad', 'Gujarat', 'India', 'Air Conditioner'), "
				+ "(9, 'Sunita', 'sunita@gmail.com', 'Sun1234', 2109876543, 'Gandhi Nagar', 'Bhopal', 'Madhya Pradesh', 'India', 'Camera'),"
				+ "(10, 'Vikas', 'vikas@gmail.com', 'Vik1234', 1098765432, 'SR Nagar', 'Hyderabad', 'Telangana', 'India', 'Vacuum Cleaner'),"
				+ "(11, 'Kiran', 'kiran@gmail.com', 'Kir1234', 1987654321, 'Kothrud', 'Pune', 'Maharashtra', 'India', 'Smart Watch'), "
				+ "(12, 'Rohan', 'rohan@gmail.com', 'Roh1234', 2987654321, 'Alkapuri', 'Vadodara', 'Gujarat', 'India', 'Gaming Console'),"
				+ "(13, 'Sneha', 'sneha@gmail.com', 'Sne1234', 3987654321, 'Gokulam', 'Mysore', 'Karnataka', 'India', 'Headphones'), "
				+ "(14, 'Rahul', 'rahul@gmail.com', 'Rah1234', 4987654321, 'Dadar', 'Mumbai', 'Maharashtra', 'India', 'Bluetooth Speaker'),"
				+ "(15, 'Meera', 'meera@gmail.com', 'Mee1234', 5987654321, 'Pali Hill', 'Mumbai', 'Maharashtra', 'India', 'Fitness Tracker'),"
				+ "(16, 'Ankita', 'ankita@gmail.com', 'Ank1234', 6987654321, 'Salt Lake', 'Kolkata', 'West Bengal', 'India', 'Router'), "
				+ "(17, 'Vishal', 'vishal@gmail.com', 'Vis1234', 7987654321, 'Secunderabad', 'Hyderabad', 'Telangana', 'India', 'Modem'),"
				+ "(18, 'Pooja', 'pooja@gmail.com', 'Poo1234', 8987654321, 'Cyber City', 'Gurgaon', 'Haryana', 'India', 'Water Purifier'),"
				+ "(19, 'Manoj', 'manoj@gmail.com', 'Man1234', 9987654321, 'Nehru Place', 'Delhi', 'Delhi', 'India', 'Printer'), "
				+ "(20, 'Divya', 'divya@gmail.com', 'Div1234', 1234567890, 'Hiranandani', 'Mumbai', 'Maharashtra', 'India', 'Scanner')";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(CustomerEnum.URL.getValue(), CustomerEnum.USERNAME.getValue(),CustomerEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
			if (value > 0) {
				System.out.println("this is saved");
			} else {
				System.out.println("this is not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
