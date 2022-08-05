package com.products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {
	
	public static Connection getMyConnection() {
		Connection con=null;
		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.jdbc.driver //com.mysql.cj.jdbc.Driver  //oracle.jdbc.driver.OracleDriver
			 
			//step2 create  the connection object 
			 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Productdetails","root","vasuki");  
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
		
		}

}