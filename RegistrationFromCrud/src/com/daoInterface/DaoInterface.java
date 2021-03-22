package com.daoInterface;

import java.util.List;

import com.Bean.BeanClass;

public interface DaoInterface {

	int save(BeanClass b);

	List<BeanClass> fetch();

}
