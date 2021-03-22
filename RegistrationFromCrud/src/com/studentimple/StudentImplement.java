package com.studentimple;

import java.util.List;

import com.Bean.BeanClass;
import com.daoInterface.DaoInterface;
import com.daoimpl.DaoImple;
import com.studentInterface.StudentInterface;

public class StudentImplement implements StudentInterface {
	DaoInterface dao=new DaoImple();
@Override
	public int save(BeanClass b) {
	
			return dao.save(b);
	}

@Override
public List<BeanClass> fetch() {
	return dao.fetch();
}

}
