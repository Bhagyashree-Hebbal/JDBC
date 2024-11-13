package com.xworkz.statements.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.statements.constants.FoodOrderEnum;

public class FoodOrderRunner {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prst = null;
		try {
			connection = DriverManager.getConnection(FoodOrderEnum.URL.getValue(), FoodOrderEnum.USERNAME.getValue(),FoodOrderEnum.PASSWORD.getValue());
			prst = connection.prepareStatement("insert into food_table values(?,?,?)");
			prst.setInt(1, 1);
			prst.setString(2, "Pizza");
			prst.setString(3, "500");

			prst.setInt(1, 2); 
			prst.setString(2, "Burger"); 
			prst.setString(3, "300");
			
			prst.setInt(1, 3); 
			prst.setString(2, "Pasta"); 
			prst.setString(3, "350");
			
			prst.setInt(1, 4); 
			prst.setString(2, "Salad"); 
			prst.setString(3, "200"); 
			
			prst.setInt(1, 5); 
			prst.setString(2, "Sushi"); 
			prst.setString(3, "600");
			
			prst.setInt(1, 6); 
			prst.setString(2, "Tacos"); 
			prst.setString(3, "250");
			
			prst.setInt(1, 7); 
			prst.setString(2, "Steak"); 
			prst.setString(3, "800");
			
			prst.setInt(1, 8); 
			prst.setString(2, "Sandwich"); 
			prst.setString(3, "150");
			
			prst.setInt(1, 9); 
			prst.setString(2, "Noodles"); 
			prst.setString(3, "400");
			
			prst.setInt(1, 10); 
			prst.setString(2, "Fried Rice"); 
			prst.setString(3, "300");
			
			prst.setInt(1, 11); 
			prst.setString(2, "Ice Cream"); 
			prst.setString(3, "100");
			
			prst.setInt(1, 12); 
			prst.setString(2, "Biryani"); 
			prst.setString(3, "450");
			
			prst.setInt(1, 13); 
			prst.setString(2, "Pancakes"); 
			prst.setString(3, "200");
			
			prst.setInt(1, 14); 
			prst.setString(2, "Waffles"); 
			prst.setString(3, "250");
			
			prst.setInt(1, 15); 
			prst.setString(2, "Smoothie"); 
			prst.setString(3, "150");
			
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
