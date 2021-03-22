package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Bean.BeanClass;
import com.connection.DbConnection;
import com.daoInterface.DaoInterface;

public class DaoImple implements DaoInterface {
int status=0;
	@Override
	public int save(BeanClass b) {
		try {
			Connection con=DbConnection.getConnection();
			PreparedStatement p=con.prepareStatement("insert into form(First_Name,Last_Name,Password,Address,Contact_No)values (?,?,?,?,?)");
			p.setString(1, b.getFirst_Name());
			p.setString(2, b.getLast_Name());
			p.setString(3, b.getPassword());
			p.setString(4, b.getAddress());
			p.setString(5, b.getContact_No());
			status=p.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	@Override
	public List<BeanClass> fetch() {
		List<BeanClass> list=new ArrayList<BeanClass>();
		try {
			Connection con=DbConnection.getConnection();
			PreparedStatement p=con.prepareStatement("select * from form");
			ResultSet rs=p.executeQuery();
			while (rs.next()) {
			BeanClass b=new BeanClass();
			b.setId(rs.getInt(1));
			b.setFirst_Name(rs.getString(2));
			b.setLast_Name(rs.getString(3));
			b.setPassword(rs.getString(4));
			b.setAddress(rs.getString(5));
			b.setContact_No(rs.getString(6));
			list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
}
