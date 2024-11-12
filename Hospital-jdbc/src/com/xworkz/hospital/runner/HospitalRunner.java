package com.xworkz.hospital.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.hospital.constants.HospitalEnum;

public class HospitalRunner {

	public static void main(String[] args) {
		
		String insertQuery = "insert into hospital_table(hospital_id,hospital_name,address,city,state,postal_code,phone_number,email,number_of_beds,specialities,facility_type,password) values (1,'Satya','Bommasandra','Bangalore','Karnataka','560099',987458765,'satya@gmail.com',10000,'Cardiology','Laboratory','985364'),"
				+ "(2, 'Apollo', 'Jayanagar', 'Bangalore', 'Karnataka', '560011', 981234567, 'apollo@gmail.com', 12000, 'Neurology', 'Hospital', '124575'),"
				+ "(3, 'Fortis', 'MG Road', 'Bangalore', 'Karnataka', '560001', 912345678, 'fortis@gmail.com', 15000, 'Orthopedics', 'Hospital', '487953'), "
				+ "(4, 'Narayana', 'Electronic City', 'Bangalore', 'Karnataka', '560100', 987456321, 'narayana@gmail.com', 14000, 'Oncology', 'Clinic', '785596'),"
				+ "(5, 'Columbia Asia', 'Whitefield', 'Bangalore', 'Karnataka', '560066', 998745632, 'columbia@gmail.com', 8000, 'Pediatrics', 'Hospital', '875945'),"
				+ "(6, 'Manipal', 'Hebbal', 'Bangalore', 'Karnataka', '560024', 985632147, 'manipal@gmail.com', 13000, 'Dermatology', 'Clinic', '875486'),"
				+ "(7, 'Aster', 'Indiranagar', 'Bangalore', 'Karnataka', '560038', 964785321, 'aster@gmail.com', 11000, 'Urology', 'Hospital', '875496'),"
				+ "(8, 'Max', 'RT Nagar', 'Bangalore', 'Karnataka', '560032', 954123678, 'max@gmail.com', 9000, 'Gastroenterology', 'Clinic', '985746'),"
				+ "(9, 'Vikram', 'Yeshwanthpur', 'Bangalore', 'Karnataka', '560022', 978564123, 'vikram@gmail.com', 10500, 'ENT', 'Hospital', '685974'),"
				+ "(10, 'Cloudnine', 'Marathahalli', 'Bangalore', 'Karnataka', '560037', 947652138, 'cloudnine@gmail.com', 7500, 'Maternity', 'Clinic', '985746'),"
				+ "(11, 'Sakra', 'Bellandur', 'Bangalore', 'Karnataka', '560103', 996325478, 'sakra@gmail.com', 9500, 'Cardiology', 'Hospital', '958746'),"
				+ "(12, 'Hosmat', 'Richmond Road', 'Bangalore', 'Karnataka', '560025', 923456789, 'hosmat@gmail.com', 8500, 'Orthopedics', 'Clinic', '357485'),"
				+ "(13, 'BGS Global', 'Kengeri', 'Bangalore', 'Karnataka', '560060', 978541236, 'bgs@gmail.com', 12500, 'Neurology', 'Hospital', '365241'),"
				+ "(14, 'Bowring', 'Shivajinagar', 'Bangalore', 'Karnataka', '560051', 923678541, 'bowring@gmail.com', 7000, 'Pediatrics', 'Hospital', '718293'),"
				+ "(15, 'St. Johns', 'Koramangala', 'Bangalore', 'Karnataka', '560034', 912347856, 'stjohns@gmail.com', 14000, 'Emergency', 'Hospital', '485962'),"
				+ "(16, 'Victoria', 'KR Market', 'Bangalore', 'Karnataka', '560002', 963258741, 'victoria@gmail.com', 12000, 'General', 'Hospital', '758642'),"
				+ "(17, 'Ramaiah', 'Mathikere', 'Bangalore', 'Karnataka', '560054', 975314268, 'ramaiah@gmail.com', 8500, 'Ophthalmology', 'Clinic', '153426'),"
				+ "(18, 'Vydehi', 'Whitefield', 'Bangalore', 'Karnataka', '560066', 986523147, 'vydehi@gmail.com', 11000, 'Nephrology', 'Hospital', '747586'),"
				+ "(19, 'KC General', 'Malleshwaram', 'Bangalore', 'Karnataka', '560003', 932145678, 'kcgeneral@gmail.com', 9500, 'Gynecology', 'Clinic', '958475'),"
				+ "(20, 'ESI', 'Rajajinagar', 'Bangalore', 'Karnataka', '560010', 941236578, 'esi@gmail.com', 10000, 'Dermatology', 'Hospital', '357486')";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(HospitalEnum.URL.getValue(), HospitalEnum.USERNAME.getValue(),HospitalEnum.PASSWORD.getValue());
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
