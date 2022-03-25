package com.xworkz.mobil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class MobileDAOImp implements MobileDAO {

	@Override
	public void add() throws SQLException {

		try {
		 Driver driver = new Driver();
		 DriverManager.registerDriver(driver);
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilebd","root","root");
		 System.out.println(connection.hashCode());
		 Statement statement = connection.createStatement();
		 int response=statement.executeUpdate("insert into mobilebd.moblie values(2000,5,4.5);");
	   		System.out.println("no Of Rows affected are"+ response+"Done......");
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void upadte() throws SQLException{
		
		try {
			 Driver driver = new Driver();
			 DriverManager.registerDriver(driver);
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilebd","root","root");
			 System.out.println(connection.hashCode());
			 Statement statement = connection.createStatement();
			 int response=statement.executeUpdate("update mobilebd.moblie set mobileRam=6 where mobilePrice=10000;");
		   		System.out.println("no Of Rows affected are"+ response+"Done......");
			}catch (Exception e) {
				e.printStackTrace();
				
			}
	}

	@Override
	public void delete() throws SQLException {
		try {
			 Driver driver = new Driver();
			 DriverManager.registerDriver(driver);
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilebd","root","root");
			 System.out.println(connection.hashCode());
			 Statement statement = connection.createStatement();
			 int response=statement.executeUpdate("delete from mobilebd.moblie where mobilePrice=10000;");
		   		System.out.println("no Of Rows affected are"+ response+"Done......");
			}catch (Exception e) {
				e.printStackTrace();
				
			}
	}

	

}
