package com.serviceinterface;

import java.util.List;

import com.bean.BeanClass;

public interface ServiceInterface {

	int save(BeanClass b);
	List<BeanClass>fetch();
	public BeanClass getEmployeeById(int id);
	public int update(BeanClass u);

}

