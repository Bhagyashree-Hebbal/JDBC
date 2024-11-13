package com.xworkz.statements.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.statements.constants.MallEnum;

public class MallRunner {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prst = null;
		try {
			connection = DriverManager.getConnection(MallEnum.URL.getValue(), MallEnum.USERNAME.getValue(),MallEnum.PASSWORD.getValue());
			prst = connection.prepareStatement("insert into mall_table values(?,?,?)");
			prst.setInt(1, 1);
			prst.setString(2, "Mall of Asia");
			prst.setString(3, "Yelahanka");

			prst.setInt(1, 2);
			prst.setString(2, "Pacific Mall"); 
			prst.setString(3, "Rajajinagar");
			
			prst.setInt(1, 3); 
			prst.setString(2, "Phoenix Marketcity"); 
			prst.setString(3, "Whitefield");
			
			prst.setInt(1, 4); 
			prst.setString(2, "UB City"); 
			prst.setString(3, "Vittal Mallya Road");
			
			prst.setInt(1, 5); 
			prst.setString(2, "Orion Mall"); 
			prst.setString(3, "Malleshwaram");
			
			prst.setInt(1, 6); 
			prst.setString(2, "Mantri Square"); 
			prst.setString(3, "Malleswaram");
			
			prst.setInt(1, 7); 
			prst.setString(2, "VR Bengaluru"); 
			prst.setString(3, "Whitefield");
			
			prst.setInt(1, 8); 
			prst.setString(2, "Inorbit Mall"); 
			prst.setString(3, "Whitefield");
			
			prst.setInt(1, 9); 
			prst.setString(2, "Garuda Mall"); 
			prst.setString(3, "Ashok Nagar");
			
			prst.setInt(1, 10); 
			prst.setString(2, "Forum Mall"); 
			prst.setString(3, "Koramangala");
			
			prst.setInt(1, 11); 
			prst.setString(2, "Gopalan Mall"); 
			prst.setString(3, "Bannerghatta Road");
			
			prst.setInt(1, 12); 
			prst.setString(2, "Royal Meenakshi Mall"); 
			prst.setString(3, "Bannerghatta Road");
			
			prst.setInt(1, 13); 
			prst.setString(2, "Lulu Mall"); 
			prst.setString(3, "Rajajinagar");
			
			prst.setInt(1, 14); 
			prst.setString(2, "Central Mall"); 
			prst.setString(3, "MG Road");
			
			prst.setInt(1, 15); 
			prst.setString(2, "Bangalore Central"); 
			prst.setString(3, "JP Nagar");
			
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
