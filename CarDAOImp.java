package com.xworkz.car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDAOImp implements CarDAO{

	@Override
	public void addCarData(int carId, String carName, int carPrice, String carModel) throws SQLException {
		String  query="insert into cardb.car values(?,?,?,?);";

		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
			System.out.println(connection.hashCode());
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, carId);
			preparedStatement.setString(2, carName);
			preparedStatement.setInt(3, carPrice);
			preparedStatement.setString(4, carModel);
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}

		
	}

	
	@Override
	public void updateCarData(int carId, String carName, int carPrice, String carModel) throws SQLException{
		String  query1="update cardb.car set carName='?',carPrice=?,carModel='?' where carId=?;";

		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
			System.out.println(connection.hashCode());
			PreparedStatement preparedStatement=connection.prepareStatement(query1);
			preparedStatement.setInt(1, carId);
			preparedStatement.setString(2, carName);
			preparedStatement.setInt(3, carPrice);
			preparedStatement.setString(4, carModel);
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}

		
	}

	@Override
	public void deleteCarData(int carId)throws SQLException {
	String	query2="delete from cardb.car where carId=?;";
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
			System.out.println(connection.hashCode());
			PreparedStatement preparedStatement=connection.prepareStatement(query2);
			preparedStatement.setInt(1, carId);
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
}

	
	