package com.springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.model.StudentRegistration;

@Repository
public class StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveForm(StudentRegistration studentRegistration) {
		int id = (Integer) this.hibernateTemplate.save(studentRegistration);
		return id;
	}
}
