package com.daoimplement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.BeanClass;
import com.connection.DbConnection;
import com.daointerface.DaoInterface;


public class DaoImplement implements DaoInterface {
	int status=0;
	@Override
	public int save(BeanClass b) {
		try {
			Connection con=DbConnection.getConnection();
			PreparedStatement p=con.prepareStatement("insert into aamir(Name,Password,Email,Country)values(?,?,?,?)");
			p.setString(1, b.getName());
			p.setString(2, b.getPassword());
			p.setString(3, b.getEmail());
			p.setString(4, b.getCountry());
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
			PreparedStatement p=con.prepareStatement("select * from aamir");
			ResultSet rs=p.executeQuery();
			while(rs.next()) {
				BeanClass b=new BeanClass();
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
				b.setPassword(rs.getString(3));
				b.setEmail(rs.getString(4));
				b.setCountry(rs.getString(5));
				list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public BeanClass getEmployeeById(int id){  
        BeanClass e=new BeanClass();  
          
        try{  
            Connection con=DbConnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from aamir where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
	
	public int update(BeanClass e){  
        int status=0;  
        try{  
            Connection con=DbConnection.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update aamir set name=?,password=?,email=?,country=? where id=?");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
            ps.setInt(5,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  

}
