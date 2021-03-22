package com.daointerface;

import java.util.List;

import com.bean.BeanClass;

public interface DaoInterface {

	int save(BeanClass b);

	List<BeanClass> fetch();
	public int update(BeanClass u);
	public BeanClass getEmployeeById(int id);

}
