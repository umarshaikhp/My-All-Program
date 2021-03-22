package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.StudentDao;
import com.springmvc.model.StudentRegistration;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public int createLayer(StudentRegistration studentRegistration) {
		return this.studentDao.saveForm(studentRegistration);
		
	}
}
