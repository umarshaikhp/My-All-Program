package com.serviceimpl;

import java.util.List;

import com.bean.BeanClass;
import com.dao.DaoInterface;
import com.daoimp.DaoiImpli;
import com.service.ServiceInterface;

public class ServiceImpliment implements ServiceInterface {
	DaoInterface dao=new DaoiImpli();
	public int save(BeanClass e) {
		return dao.save(e);
	

	}
	@Override
	public List<BeanClass> fetch() {
		return dao.fetch();
	
	}
}

