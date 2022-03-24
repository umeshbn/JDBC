package com.xworkz.mobile;


import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class App {
	
	public static void main(String[] args) {
		
		try {
			Driver driver;
			driver = new Driver();
			DriverManager.registerDriver(driver);
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/umeshdb","root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
