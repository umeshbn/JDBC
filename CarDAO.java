package com.xworkz.car;

public interface CarDAO {

	public void addCarData(int carId, String carName, int carPrice, String carModel);

	public void updateCarData( String carName,String carModel,int carId);

	public void deleteCarData(int carId);
}
