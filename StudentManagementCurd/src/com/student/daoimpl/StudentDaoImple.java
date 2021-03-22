package com.student.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.student.Bean.StudentBean;
import com.student.Dbconnection.DbConnection;
import com.student.dao.StudentDao;

public class StudentDaoImple  implements StudentDao{

	@Override
	public int Insert(StudentBean bean) {
		int status=0;
		try {
		Connection con=DbConnection.getConnection();
		PreparedStatement p=con.prepareStatement("insert into student(Name,Address,Email,Age,Mobile_no) values(?,?,?,?,?)");
		p.setString(1, bean.getName());
		p.setString(2, bean.getAddress());
		p.setString(3, bean.getEmail());
		p.setString(4, bean.getAge());
		p.setString(5, bean.getMobile_no());
		status=p.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
