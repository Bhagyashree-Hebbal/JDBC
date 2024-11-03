package com.xworkz.shopdelete.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShopDeleteRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/shop_jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";
		String deleteQuery1 = "delete from shop_table where id=16";
		String deleteQuery2 = "delete from shop_table where id=17";
		String deleteQuery3 = "delete from shop_table where id=18";
		String deleteQuery4 = "delete from shop_table where id=19";
		String deleteQuery5 = "delete from shop_table where id=20";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery1);
			statement.executeUpdate(deleteQuery2);
			statement.executeUpdate(deleteQuery3);
			statement.executeUpdate(deleteQuery4);
			statement.executeUpdate(deleteQuery5);

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
