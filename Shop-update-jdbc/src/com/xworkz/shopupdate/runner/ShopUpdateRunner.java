package com.xworkz.shopupdate.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShopUpdateRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/shop_jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuery1 = "update shop_table set item_name='Colgate Paste' where id=3";
		String updateQuery2 = "update shop_table set item_name='Dairy Milk' where id=11";
		String updateQuery3 = "update shop_table set item_name='Potato' where id=12";
		String updateQuery4 = "update shop_table set item_name='Chilli' where id=16";
		String updateQuery5 = "update shop_table set item_name='Custard Apple' where id=18";
		String updateQuery6 = "update shop_table set item_name='Mysore Sandle soap' where id=19";
		String updateQuery7 = "update shop_table set item_name='Dry Fruits' where id=10";
		String updateQuery8 = "update shop_table set item_name='Sweet Corn' where id=9";
		String updateQuery9 = "update shop_table set item_name='Sunflower oil' where id=4";
		String updateQuery10 = "update shop_table set item_name='Chips' where id=13";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery1);
			statement.executeUpdate(updateQuery2);
			statement.executeUpdate(updateQuery3);
			statement.executeUpdate(updateQuery4);
			statement.executeUpdate(updateQuery5);
			statement.executeUpdate(updateQuery6);
			statement.executeUpdate(updateQuery7);
			statement.executeUpdate(updateQuery8);
			statement.executeUpdate(updateQuery9);
			statement.executeUpdate(updateQuery10);

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
