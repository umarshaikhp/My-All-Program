package com.daoimple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Bean.BeanClass;
import com.connection.DbConnection;
import com.daointerface.DaoInterface;

public class DaoImplement implements DaoInterface {
int status=0;
	@Override
	public int save(BeanClass b) {
		try {
			Connection con=DbConnection.getConnection();
			PreparedStatement p=con.prepareStatement("insert into kasimi(Name,Password,Email)values(?,?,?)");
			p.setString(1, b.getName());
			p.setString(2, b.getPassword());
			p.setString(3, b.getPassword());
			status=p.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	@Override
	public List<BeanClass> fetch() {
		List<BeanClass>list=new ArrayList<BeanClass>();
		try {
			Connection con=DbConnection.getConnection();
			PreparedStatement p=con.prepareStatement("select * from kasimi");
			ResultSet rs=p.executeQuery();
			while(rs.next()) {
			BeanClass b=new BeanClass();
			b.setId(rs.getInt(1));
			b.setName(rs.getString(2));
			b.setPassword(rs.getString(3));
			b.setEmail(rs.getString(4));
			list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}

