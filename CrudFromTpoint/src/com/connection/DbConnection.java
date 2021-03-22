package com.connection;

import java.sql.*;;

public class DbConnection {
	public static Connection getConnenction() {
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aamir","root","root");
	}catch(Exception e) {
		e.printStackTrace();
	}
return con;
}
}