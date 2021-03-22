package com.daoimple;

import java.sql.*;

import com.bean.Beanclass;
import com.connection.DbConnection;
import com.dao.Daointerface;

public class Daoimplement implements Daointerface {

	@Override
	public int save(Beanclass b) {
		int status=0;
		try {
			Connection con=DbConnection.getConnenction();
			PreparedStatement p=con.prepareStatement("insert into aaaa(Name,Password,Email)values (?,?,?)");
			p.setString(1, b.getName());
			p.setString(2, b.getPassword());
			p.setString(3, b.getEmail());
			status=p.executeUpdate();
		} catch (Exception e) {
			
		}
		return status;
	}

}
