package com.spring.professional.exam.tutorial.module01.question19.proxy.cglib;

import com.spring.professional.exam.tutorial.module01.question19.dao.DepartmentDao;
import com.spring.professional.exam.tutorial.module01.question19.ds.Department;

import net.sf.cglib.proxy.Enhancer;

public class Runner {
	
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(new DepartmentdaoMethodInterceptor());
		enhancer.setSuperclass(DepartmentDao.class);		
		
		DepartmentDao departmentDao = (DepartmentDao) enhancer.create();
		
		departmentDao.findBiId("5");
		departmentDao.save(new Department());
	}

}
