package com.serviceimple;

import com.bean.Beanclass;
import com.dao.Daointerface;
import com.daoimple.Daoimplement;
import com.service.Serviceinterface;

public class Serviceimplement implements Serviceinterface {
	Daointerface dao=new Daoimplement();
	@Override
	public int save(Beanclass b) {
		return dao.save(b);
	}

}
