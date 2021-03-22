package com.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.BeanClass;
import com.connection.DbConnection;
import com.dao.DaoInterface;


public class DaoiImpli implements DaoInterface {

	public int save(BeanClass e) {
	int status =0;
	try {
		Connection con=DbConnection.getConnection();
		PreparedStatement p=con.prepareStatement("insert into honda(name,age,address,mobile_number,country) values(?,?,?,?,?)");
		p.setString(1,e.getName());
		p.setString(2, e.getAge());
		p.setString(3, e.getAddress());
		p.setString(4, e.getMobile_number());
		p.setString(5, e.getCountry());
		status =p.executeUpdate();
	}catch(Exception p) {
		p.printStackTrace();
	}
	return status;
	}

	@Override
	public List<BeanClass> fetch() {
		List<BeanClass>list=new ArrayList<BeanClass>();
		try {
			Connection con=DbConnection.getConnection();
			PreparedStatement p=con.prepareStatement("select * from honda");
			ResultSet rs=p.executeQuery(); 
			while(rs.next()) {
				BeanClass e=new BeanClass();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setAge(rs.getString(3));
				e.setAddress(rs.getString(4));
				e.setMobile_number(rs.getString(5));
				e.setCountry(rs.getString(6));
				list.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
