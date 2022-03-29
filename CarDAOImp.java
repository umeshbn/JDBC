package com.xworkz.car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDAOImp implements CarDAO {

	@Override
	public void addCarData(int carId, String carName, int carPrice, String carModel) {
		String query = "insert into cardb.car values(?,?,?,?);";
		Connection connection = null;

		try {
			if (connection == null) {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb", "root", "root");
				System.out.println(connection.hashCode());
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, carId);
				preparedStatement.setString(2, carName);
				preparedStatement.setInt(3, carPrice);
				preparedStatement.setString(4, carModel);
				System.out.println(preparedStatement);
				preparedStatement.executeUpdate();
			}

		} catch (SQLException e) {
			System.out.println(e);

		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("connection is successfull");
			} else {
				System.out.println("connection is not successfull");

			}
		}

	}

	@Override
	public void updateCarData(String carName, String carModel, int carId) {
		String query1 = "update cardb.car set carName=?,carModel=? where carId=?;";
		Connection connection = null;
		try {
			if (connection == null) {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb", "root", "root");
				System.out.println(connection.hashCode());
				PreparedStatement preparedStatement = connection.prepareStatement(query1);
				preparedStatement.setString(1, carName);
				preparedStatement.setString(2, carModel);
				preparedStatement.setInt(3, carId);
				System.out.println(preparedStatement);
				preparedStatement.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println(e);

		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("connection is successfull");
			} else {
				System.out.println("connection is not successfull");

			}
		}

	}

	@Override
	public void deleteCarData(int carId) {
		String query2 = "delete from cardb.car where carId=?;";
		Connection connection = null;
		try {
			if (connection == null) {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb", "root", "root");
				System.out.println(connection.hashCode());
				PreparedStatement preparedStatement = connection.prepareStatement(query2);
				preparedStatement.setInt(1, carId);
				System.out.println(preparedStatement);
				preparedStatement.executeUpdate();

			}
		} catch (Exception e) {
			System.out.println(e);

		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("connection is successfull");
			} else {
				System.out.println("connection is not successfull");

			}
		}

	}
}
