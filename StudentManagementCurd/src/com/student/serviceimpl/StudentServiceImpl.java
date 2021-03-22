package com.student.serviceimpl;

import com.student.Bean.StudentBean;
import com.student.Service.StudentServiceInterface;
import com.student.dao.StudentDao;
import com.student.daoimpl.StudentDaoImple;

public class StudentServiceImpl implements StudentServiceInterface {

	@Override
	public int Insert(StudentBean bean) {
		StudentDao dao= new StudentDaoImple();
		return dao.Insert(bean);
	}



}
