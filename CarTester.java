package com.xworkz.car;

import java.sql.SQLException;
import java.util.Scanner;

public class CarTester {

	 public static void main(String[] args) throws SQLException {
		 Scanner scanner = new Scanner(System.in);
		
		 int carId=scanner.nextInt();
		 System.out.println("carId="+carId);
		 String carName=scanner.next();
		 System.out.println("carName="+carName);
		 int carPrice=scanner.nextInt();
		 System.out.println("carPrice="+carPrice); 
		 String carModel=scanner.next();
		 System.out.println("carModel="+carModel);
		 
		 CarDAOImp carDAOImp = new CarDAOImp();
		// carDAOImp.addCarData(carId, carModel, carPrice, carModel);
		// System.out.println(carDAOImp);
		// carDAOImp.updateCarData(carId, carModel, carPrice, carModel);
		// System.out.println(carDAOImp);
		 carDAOImp.deleteCarData(carId);
		 System.out.println(carDAOImp);
	}
}
