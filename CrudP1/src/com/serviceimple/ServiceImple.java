package com.serviceimple;

import java.util.List;

import com.Bean.BeanClass;
import com.daoimple.DaoImplement;
import com.daointerface.DaoInterface;
import com.serviceInter.ServiceInteface;

public class ServiceImple implements ServiceInteface {
	DaoInterface dao=new DaoImplement();
	@Override
	public int save(BeanClass b) {
		
		return dao.save(b);
	}
	@Override
	public List<BeanClass> fetch() {
		
		return dao.fetch();
	}
	
	}


