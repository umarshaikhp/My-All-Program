package com.validate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
	public static boolean show(String email,String password) {
		boolean st=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","root");
			PreparedStatement p=con.prepareStatement("select * from validationform where email=? and password=?");
			p.setString(1, email);
			p.setString(2, password);
			ResultSet r=p.executeQuery();
			st=r.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
	}

}
