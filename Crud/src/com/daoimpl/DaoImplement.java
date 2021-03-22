package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.BeanClass;
import com.dao.DaoInterface;
import com.dbconnection.DbConnection;

public class DaoImplement implements DaoInterface{
	 public int save(BeanClass e){  
	        int status=0;  
	        try{  
	            Connection con=DbConnection.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into users(name,email,country) values (?,?,?)");  
	            ps.setString(1,e.getName());  
	            ps.setString(2,e.getEmail());  
	            ps.setString(3,e.getCountry());  
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){
	        	ex.printStackTrace();
	        	}
			return status;  
	          
}
}