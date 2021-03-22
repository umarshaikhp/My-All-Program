package com.dao;

import java.util.List;

import com.bean.BeanClass;

public interface DaoInterface {
	public int save(BeanClass e);

	public List<BeanClass> fetch();



}
