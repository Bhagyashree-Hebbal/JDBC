package com.xworkz.banking.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bank.constants.BankEnum;

public class BankRunner {

	public static void main(String[] args) {
		
		String insertQuery = "insert into bank_table(account_id,account_holder_name,account_number,account_type,balance,branch_name,branch_address,phone_number,email,password,date_opened,status) values (1,'Pranati',48576958423,'Savings',50000,'SBI','Rajajinagar',875486957,'pranati@gmail.com','225361','2020-06-08','Active'),"
				+ "(2, 'Amit', 48576958424, 'Checking', 150000, 'HDFC', 'MG Road', 875486958, 'amit@gmail.com', '748596', '2018-11-15', 'Active'),"
				+ "(3, 'Sita', 48576958425, 'Savings', 75000, 'ICICI', 'Whitefield', 875486959, 'sita@gmail.com', '958476', '2019-01-22', 'Active'),"
				+ "(4, 'Raj', 48576958426, 'Fixed Deposit', 200000, 'Axis', 'Jayanagar', 875486960, 'raj@gmail.com', '145263', '2021-03-10', 'Active'),"
				+ "(5, 'Gita', 48576958427, 'Savings', 60000, 'Canara', 'Indiranagar', 875486961, 'gita@gmail.com', '748759', '2017-07-18', 'Active'), "
				+ "(6, 'Rahul', 48576958428, 'Current', 300000, 'Kotak', 'Koramangala', 875486962, 'rahul@gmail.com', '255836', '2016-05-05', 'Active'), "
				+ "(7, 'Sunita', 48576958429, 'Savings', 80000, 'Union Bank', 'BTM Layout', 875486963, 'sunita@gmail.com', '417485', '2022-10-14', 'Active'), "
				+ "(8, 'Akhil', 48576958430, 'Recurring Deposit', 120000, 'PNB', 'Malleshwaram', 875486964, 'akhil@gmail.com', '357482', '2021-12-01', 'Active'), "
				+ "(9, 'Priya', 48576958431, 'Savings', 65000, 'HSBC', 'Hebbal', 875486965, 'priya@gmail.com', '984576', '2020-08-20', 'Active'), "
				+ "(10, 'Vikram', 48576958432, 'Fixed Deposit', 500000, 'Syndicate', 'Yeshwanthpur', 875486966, 'vikram@gmail.com', '197807', '2019-06-11', 'Active'), "
				+ "(11, 'Nisha', 48576958433, 'Savings', 40000, 'Indian Bank', 'Banashankari', 875486967, 'nisha@gmail.com', '871219', '2017-11-21', 'Active'), "
				+ "(12, 'Arjun', 48576958434, 'Current', 450000, 'SBI', 'Marathahalli', 875486968, 'arjun@gmail.com', '191117', '2015-05-25', 'Active'), "
				+ "(13, 'Sneha', 48576958435, 'Savings', 35000, 'Canara', 'Kengeri', 875486969, 'sneha@gmail.com', '980301', '2020-01-03', 'Active'), "
				+ "(14, 'Rohan', 48576958436, 'Savings', 90000, 'Axis', 'Basavanagudi', 875486970, 'rohan@gmail.com', '191025', '2019-07-23', 'Active'), "
				+ "(15, 'Meera', 48576958437, 'Savings', 25000, 'ICICI', 'Majestic', 875486971, 'meera@gmail.com', '890811', '2018-12-10', 'Active'), "
				+ "(16, 'Anil', 48576958438, 'Savings', 15000, 'HDFC', 'KR Puram', 875486972, 'anil@gmail.com', '197530', '2017-08-30', 'Active'), "
				+ "(17, 'Kavya', 48576958439, 'Recurring Deposit', 100000, 'Kotak', 'HSR Layout', 875486973, 'kavya@gmail.com', '199309', '2016-09-17', 'Active'), "
				+ "(18, 'Manoj', 48576958440, 'Savings', 70000, 'PNB', 'Bannerghatta', 875486974, 'manoj@gmail.com', '199285', '2015-12-15', 'Active'), "
				+ "(19, 'Divya', 48576958441, 'Savings', 95000, 'Union Bank', 'BTM Layout', 875486975, 'divya@gmail.com', '835205', '2014-11-11', 'Active'), "
				+ "(20, 'Ravi', 48576958442, 'Current', 550000, 'Indian Bank', 'Electronic City', 875486976, 'ravi@gmail.com', '457812', '2013-06-30', 'Active')";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(BankEnum.URL.getValue(), BankEnum.USERNAME.getValue(),BankEnum.PASSWORD.getValue());
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
