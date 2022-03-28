package com.xworkz.car;

import java.sql.SQLException;

public interface CarDAO {
	
	void addCarData(int carId,String carName,int carPrice,String carModel) throws SQLException;
	void updateCarData(int carId,String carName,int carPrice,String carModel) throws SQLException;
	void deleteCarData(int carId)throws SQLException;

}
