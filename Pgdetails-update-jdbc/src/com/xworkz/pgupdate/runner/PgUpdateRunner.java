package com.xworkz.pgupdate.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PgUpdateRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/pgdetails_jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuery1 = "update pgdetails_table set pg_loc='Gulbarga' where id=3";
		String updateQuery2 = "update pgdetails_table set pg_loc='Mysore' where id=11";
		String updateQuery3 = "update pgdetails_table set pg_loc='Belgavi' where id=12";
		String updateQuery4 = "update pgdetails_table set pg_loc='Chennai' where id=16";
		String updateQuery5 = "update pgdetails_table set pg_loc='Davangere' where id=18";
		String updateQuery6 = "update pgdetails_table set pg_loc='Bangalore' where id=19";
		String updateQuery7 = "update pgdetails_table set pg_loc='Yadagiri' where id=10";
		String updateQuery8 = "update pgdetails_table set pg_loc='Bijapur' where id=9";
		String updateQuery9 = "update pgdetails_table set pg_loc='Gurmitkal' where id=4";
		String updateQuery10 = "update pgdetails_table set pg_loc='Hassan' where id=13";

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
