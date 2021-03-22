package com.daointerface;

import java.util.List;

import com.Bean.BeanClass;

public interface DaoInterface {

	int save(BeanClass b);

	public List<BeanClass> fetch();

}
