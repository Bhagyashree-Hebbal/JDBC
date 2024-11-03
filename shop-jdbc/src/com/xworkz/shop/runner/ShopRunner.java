package com.xworkz.shop.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShopRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/shop_jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery1 = "insert into shop_table values(1,'Soap',50)";
		String insertQuery2 = "insert into shop_table values(2,'Detergent',70)";
		String insertQuery3 = "insert into shop_table values(3,'Paste',100)";
		String insertQuery4 = "insert into shop_table values(4,'Oil',200)";
		String insertQuery5 = "insert into shop_table values(5,'Rice',250)";
		String insertQuery6 = "insert into shop_table values(6,'Wheet',300)";
		String insertQuery7 = "insert into shop_table values(7,'Dal',400)";
		String insertQuery8 = "insert into shop_table values(8,'Tooth bresh',30)";
		String insertQuery9 = "insert into shop_table values(9,'Corn',500)";
		String insertQuery10 = "insert into shop_table values(10,'Dates',100)";
		String insertQuery11 = "insert into shop_table values(11,'Chacolate',80)";
		String insertQuery12 = "insert into shop_table values(12,'Vegetables',20)";
		String insertQuery13 = "insert into shop_table values(13,'Snacks',30)";
		String insertQuery14 = "insert into shop_table values(14,'Shampoo',10)";
		String insertQuery15 = "insert into shop_table values(15,'Kurkure',50)";
		String insertQuery16 = "insert into shop_table values(16,'Carrot',50)";
		String insertQuery17 = "insert into shop_table values(17,'Fruits',70)";
		String insertQuery18 = "insert into shop_table values(18,'Apple',100)";
		String insertQuery19 = "insert into shop_table values(19,'Santoor soap',40)";
		String insertQuery20 = "insert into shop_table values(20,'Tomato',50)";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			statement.executeUpdate(insertQuery1);
			statement.executeUpdate(insertQuery2);
			statement.executeUpdate(insertQuery3);
			statement.executeUpdate(insertQuery4);
			statement.executeUpdate(insertQuery5);
			statement.executeUpdate(insertQuery6);
			statement.executeUpdate(insertQuery7);
			statement.executeUpdate(insertQuery8);
			statement.executeUpdate(insertQuery9);
			statement.executeUpdate(insertQuery10);
			statement.executeUpdate(insertQuery11);
			statement.executeUpdate(insertQuery12);
			statement.executeUpdate(insertQuery13);
			statement.executeUpdate(insertQuery14);
			statement.executeUpdate(insertQuery15);
			statement.executeUpdate(insertQuery16);
			statement.executeUpdate(insertQuery17);
			statement.executeUpdate(insertQuery18);
			statement.executeUpdate(insertQuery19);
			statement.executeUpdate(insertQuery20);

			if (connection != null) {
				System.out.println("this is connected");
			} else {
				System.out.println("this is not connected");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
