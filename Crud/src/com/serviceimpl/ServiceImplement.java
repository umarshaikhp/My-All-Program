package com.serviceimpl;

import com.bean.BeanClass;
import com.dao.DaoInterface;
import com.daoimpl.DaoImplement;
import com.service.ServiceInterface;

public class ServiceImplement  implements ServiceInterface{
	public int  save(BeanClass e) {
		DaoInterface dao=new DaoImplement();
		 return dao.save(e);
		
	}

}
