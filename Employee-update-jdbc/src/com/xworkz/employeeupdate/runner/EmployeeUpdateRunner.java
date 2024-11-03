package com.xworkz.employeeupdate.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeUpdateRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/company_jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuery1 = "update emp_table set emp_qualification='BE' where emp_id=3";
		String updateQuery2 = "update emp_table set emp_qualification='BE' where emp_id=11";
		String updateQuery3 = "update emp_table set emp_qualification='CSE' where emp_id=12";
		String updateQuery4 = "update emp_table set emp_qualification='MBA' where emp_id=16";
		String updateQuery5 = "update emp_table set emp_qualification='BSC' where emp_id=18";
		String updateQuery6 = "update emp_table set emp_qualification='Barch' where emp_id=19";
		String updateQuery7 = "update emp_table set emp_qualification='Diploma' where emp_id=10";
		String updateQuery8 = "update emp_table set emp_qualification='Diploma' where emp_id=9";
		String updateQuery9 = "update emp_table set emp_qualification='BTech' where emp_id=4";
		String updateQuery10 = "update emp_table set emp_qualification='BCA' where emp_id=13";

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
