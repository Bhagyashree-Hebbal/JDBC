package com.xworkz.student.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.student.constants.StudentEnum;

public class StudentRunner {

	public static void main(String[] args) {
		
		String insertQuery = "insert into student_table (id,name,lastName, email, password, phone_no, address, city, state, country) values (1,'Bhagyashree','Hebbal','bhagya@gmail.com','12345',78459612,'Ramnagar','Kalburagi','Karntaka','India'),"
				+ "(2, 'Raj', 'Shetty', 'raj.shetty@gmail.com', 'password123', 987651210, 'MG Road', 'Bangalore', 'Karnataka', 'India'),"
				+ "(3, 'Sita', 'Patil', 'sita.patil@gmail.com', 'password456', 876432109, 'Karve Road', 'Pune', 'Maharashtra', 'India'),"
				+ "(4, 'Ram', 'Kumar', 'ram.kumar@gmail.com', 'password789', 765432108, 'Brigade Road', 'Chennai', 'Tamil Nadu', 'India'),"
				+ "(5, 'Gita', 'Desai', 'gita.desai@gmail.com', 'password101', 654321087, 'Lajpat Nagar', 'Delhi', 'Delhi', 'India'),"
				+ "(6, 'Amit', 'Shah', 'amit.shah@gmail.com', 'password111', 543210876, 'MG Road', 'Mumbai', 'Maharashtra', 'India'),"
				+ "(7, 'Priya', 'Verma', 'priya.verma@gmail.com', 'password121', 432108765, 'Sector 17', 'Chandigarh', 'Punjab', 'India'),"
				+ "(8, 'Anil', 'Mehta', 'anil.mehta@gmail.com', 'password131', 321087654, 'Ring Road', 'Ahmedabad', 'Gujarat', 'India'),"
				+ "(9, 'Sunita', 'Gupta', 'sunita.gupta@gmail.com', 'password141', 210876543, 'Gandhi Nagar', 'Bhopal', 'Madhya Pradesh', 'India'),"
				+ "(10, 'Vikas', 'Reddy', 'vikas.reddy@gmail.com', 'password151', 109765432, 'SR Nagar', 'Hyderabad', 'Telangana', 'India'),"
				+ "(11, 'Kiran', 'Sharma', 'kiran.sharma@gmail.com', 'password161', 198754321, 'Kothrud', 'Pune', 'Maharashtra', 'India'),"
				+ "(12, 'Rohan', 'Pandey', 'rohan.pandey@gmail.com', 'password171', 297654321, 'Alkapuri', 'Vadodara', 'Gujarat', 'India'),"
				+ "(13, 'Sneha', 'Joshi', 'sneha.joshi@gmail.com', 'password181', 398654321, 'Gokulam', 'Mysore', 'Karnataka', 'India'),"
				+ "(14, 'Rahul', 'Jain', 'rahul.jain@gmail.com', 'password191', 497654321, 'Dadar', 'Mumbai', 'Maharashtra', 'India'),"
				+ "(15, 'Meera', 'Nair', 'meera.nair@gmail.com', 'password201', 587654321, 'Pali Hill', 'Mumbai', 'Maharashtra', 'India'),"
				+ "(16, 'Ankita', 'Sen', 'ankita.sen@gmail.com', 'password211', 687654321, 'Salt Lake', 'Kolkata', 'West Bengal', 'India'),"
				+ "(17, 'Vishal', 'Yadav', 'vishal.yadav@gmail.com', 'password221', 787654321, 'Secunderabad', 'Hyderabad', 'Telangana', 'India'),"
				+ "(18, 'Pooja', 'Singh', 'pooja.singh@gmail.com', 'password231', 897654321, 'Cyber City', 'Gurgaon', 'Haryana', 'India'),"
				+ "(19, 'Manoj', 'Patel', 'manoj.patel@gmail.com', 'password241', 997654321, 'Nehru Place', 'Delhi', 'Delhi', 'India'),"
				+ "(20, 'Divya', 'Shukla', 'divya.shukla@gmail.com', 'password251', 123456790, 'Hiranandani', 'Mumbai', 'Maharashtra', 'India')";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(StudentEnum.URL.getValue(), StudentEnum.USERNAME.getValue(), StudentEnum.PASSWORD.getValue());
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
