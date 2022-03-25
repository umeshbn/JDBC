package com.xworkz.mobil;

import java.sql.SQLException;

public class MobileTester {
	public static void main(String[] args) throws SQLException {
		
		MobileDAOImp m=new MobileDAOImp();
		m.add();
	m.upadte();
	m.delete();
	
	}
}
 