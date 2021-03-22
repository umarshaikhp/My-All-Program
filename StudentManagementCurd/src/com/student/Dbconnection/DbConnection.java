package com.student.Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/bike","root","root"); 	
			 }
		catch(Exception h) {
			h.printStackTrace();
		}
		
		return con;
		
	}

}
