package com.xworkz.database.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.database.constants.SportsEnum;
import com.xworkz.database.dto.SportsDTO;

public class SportsRunner {

	public static void main(String[] args) {
		
		SportsDTO sportsDTO1=new SportsDTO(1, "Cricket Team", "Virat Kohli", "Cricket", 300, 50, "M. A. Chidambaram Stadium", "Ravi Shastri", "ICC", 1);
		SportsDTO sportsDTO2 = new SportsDTO(2, "Hockey Team", "Manpreet Singh", "Hockey", 5, 60, "Kalinga Stadium", "Harendra Singh", "FIH", 2); 
		SportsDTO sportsDTO3 = new SportsDTO(3, "Football Team", "Sunil Chhetri", "Football", 2, 90, "Salt Lake Stadium", "Igor Stimac", "AFC", 3); 
		SportsDTO sportsDTO4 = new SportsDTO(4, "Badminton Team", "P. V. Sindhu", "Badminton", 21, 60, "Indira Gandhi Arena", "Pullela Gopichand", "BWF", 1); 
		SportsDTO sportsDTO5 = new SportsDTO(5, "Kabaddi Team", "Ajay Thakur", "Kabaddi", 7, 40, "Indira Gandhi Arena", "Rakesh Kumar", "PKL", 1); 
		SportsDTO sportsDTO6 = new SportsDTO(6, "Tennis Team", "Rohan Bopanna", "Tennis", 2, 120, "R.K. Khanna Tennis Complex", "Zeeshan Ali", "ATP", 2); 
		SportsDTO sportsDTO7 = new SportsDTO(7, "Chess Team", "Viswanathan Anand", "Chess", 1, 120, "Chess Academy", "P. Harikrishna", "FIDE", 1); 
		SportsDTO sportsDTO8 = new SportsDTO(8, "Table Tennis Team", "Sharath Kamal", "Table Tennis", 3, 60, "Indira Gandhi Arena", "G. S. S. Shekar", "ITTF", 2); 
		SportsDTO sportsDTO9 = new SportsDTO(9, "Wrestling Team", "Bajrang Punia", "Wrestling", 1, 60, "Indira Gandhi Arena", "Anil Kumar", "UWW", 1); 
		SportsDTO sportsDTO10 = new SportsDTO(10, "Athletics Team", "Neeraj Chopra", "Athletics", 1, 60, "Jawaharlal Nehru Stadium", "Uwe Hohn", "IAAF", 1);
		
		Connection connection = null;
		PreparedStatement prst = null;
		try {
			connection = DriverManager.getConnection(SportsEnum.URL.getValue(), SportsEnum.USERNAME.getValue(),SportsEnum.PASSWORD.getValue());
			prst = connection.prepareStatement("insert into sports_table values(?,?,?,?,?,?,?,?,?,?)");
			
			prst.setInt(1,sportsDTO1.getTeamId());
			prst.setString(2, sportsDTO1.getTeamName());
			prst.setString(3, sportsDTO1.getPlayerName());
			prst.setString(4, sportsDTO1.getSportType());
			prst.setInt(5, sportsDTO1.getScore());
			prst.setInt(6, sportsDTO1.getGameDuration());
			prst.setString(7, sportsDTO1.getVenue());
			prst.setString(8, sportsDTO1.getCoachName());
			prst.setString(9, sportsDTO1.getLeague());
			prst.setInt(10, sportsDTO1.getRanking());
			prst.addBatch();
			
			prst.setInt(1,sportsDTO2.getTeamId());
			prst.setString(2, sportsDTO2.getTeamName());
			prst.setString(3, sportsDTO2.getPlayerName());
			prst.setString(4, sportsDTO2.getSportType());
			prst.setInt(5, sportsDTO2.getScore());
			prst.setInt(6, sportsDTO2.getGameDuration());
			prst.setString(7, sportsDTO2.getVenue());
			prst.setString(8, sportsDTO2.getCoachName());
			prst.setString(9, sportsDTO2.getLeague());
			prst.setInt(10, sportsDTO2.getRanking());
			prst.addBatch();
			
			prst.setInt(1,sportsDTO3.getTeamId());
			prst.setString(2, sportsDTO3.getTeamName());
			prst.setString(3, sportsDTO3.getPlayerName());
			prst.setString(4, sportsDTO3.getSportType());
			prst.setInt(5, sportsDTO3.getScore());
			prst.setInt(6, sportsDTO3.getGameDuration());
			prst.setString(7, sportsDTO3.getVenue());
			prst.setString(8, sportsDTO3.getCoachName());
			prst.setString(9, sportsDTO3.getLeague());
			prst.setInt(10, sportsDTO3.getRanking());
			prst.addBatch();
			
			prst.setInt(1,sportsDTO4.getTeamId());
			prst.setString(2, sportsDTO4.getTeamName());
			prst.setString(3, sportsDTO4.getPlayerName());
			prst.setString(4, sportsDTO4.getSportType());
			prst.setInt(5, sportsDTO4.getScore());
			prst.setInt(6, sportsDTO4.getGameDuration());
			prst.setString(7, sportsDTO4.getVenue());
			prst.setString(8, sportsDTO4.getCoachName());
			prst.setString(9, sportsDTO4.getLeague());
			prst.setInt(10, sportsDTO4.getRanking());
			prst.addBatch();
			
			prst.setInt(1,sportsDTO5.getTeamId());
			prst.setString(2, sportsDTO5.getTeamName());
			prst.setString(3, sportsDTO5.getPlayerName());
			prst.setString(4, sportsDTO5.getSportType());
			prst.setInt(5, sportsDTO5.getScore());
			prst.setInt(6, sportsDTO5.getGameDuration());
			prst.setString(7, sportsDTO5.getVenue());
			prst.setString(8, sportsDTO5.getCoachName());
			prst.setString(9, sportsDTO5.getLeague());
			prst.setInt(10, sportsDTO5.getRanking());
			prst.addBatch();
			
			prst.setInt(1,sportsDTO6.getTeamId());
			prst.setString(2, sportsDTO6.getTeamName());
			prst.setString(3, sportsDTO6.getPlayerName());
			prst.setString(4, sportsDTO6.getSportType());
			prst.setInt(5, sportsDTO6.getScore());
			prst.setInt(6, sportsDTO6.getGameDuration());
			prst.setString(7, sportsDTO6.getVenue());
			prst.setString(8, sportsDTO6.getCoachName());
			prst.setString(9, sportsDTO6.getLeague());
			prst.setInt(10, sportsDTO6.getRanking());
			prst.addBatch();
			
			prst.setInt(1,sportsDTO7.getTeamId());
			prst.setString(2, sportsDTO7.getTeamName());
			prst.setString(3, sportsDTO7.getPlayerName());
			prst.setString(4, sportsDTO7.getSportType());
			prst.setInt(5, sportsDTO7.getScore());
			prst.setInt(6, sportsDTO7.getGameDuration());
			prst.setString(7, sportsDTO7.getVenue());
			prst.setString(8, sportsDTO7.getCoachName());
			prst.setString(9, sportsDTO7.getLeague());
			prst.setInt(10, sportsDTO7.getRanking());
			prst.addBatch();
			
			prst.setInt(1,sportsDTO8.getTeamId());
			prst.setString(2, sportsDTO8.getTeamName());
			prst.setString(3, sportsDTO8.getPlayerName());
			prst.setString(4, sportsDTO8.getSportType());
			prst.setInt(5, sportsDTO8.getScore());
			prst.setInt(6, sportsDTO8.getGameDuration());
			prst.setString(7, sportsDTO8.getVenue());
			prst.setString(8, sportsDTO8.getCoachName());
			prst.setString(9, sportsDTO8.getLeague());
			prst.setInt(10, sportsDTO8.getRanking());
			prst.addBatch();
			
			prst.setInt(1,sportsDTO9.getTeamId());
			prst.setString(2, sportsDTO9.getTeamName());
			prst.setString(3, sportsDTO9.getPlayerName());
			prst.setString(4, sportsDTO9.getSportType());
			prst.setInt(5, sportsDTO9.getScore());
			prst.setInt(6, sportsDTO9.getGameDuration());
			prst.setString(7, sportsDTO9.getVenue());
			prst.setString(8, sportsDTO9.getCoachName());
			prst.setString(9, sportsDTO9.getLeague());
			prst.setInt(10, sportsDTO9.getRanking());
			prst.addBatch();
			
			prst.setInt(1,sportsDTO10.getTeamId());
			prst.setString(2, sportsDTO10.getTeamName());
			prst.setString(3, sportsDTO10.getPlayerName());
			prst.setString(4, sportsDTO10.getSportType());
			prst.setInt(5, sportsDTO10.getScore());
			prst.setInt(6, sportsDTO10.getGameDuration());
			prst.setString(7, sportsDTO10.getVenue());
			prst.setString(8, sportsDTO10.getCoachName());
			prst.setString(9, sportsDTO10.getLeague());
			prst.setInt(10, sportsDTO10.getRanking());
			prst.addBatch();
			
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
