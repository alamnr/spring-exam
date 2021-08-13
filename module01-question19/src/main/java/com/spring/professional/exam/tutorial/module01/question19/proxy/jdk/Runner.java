package com.spring.professional.exam.tutorial.module01.question19.proxy.jdk;

import java.lang.reflect.Proxy;

import com.spring.professional.exam.tutorial.module01.question19.dao.PersonDao;
import com.spring.professional.exam.tutorial.module01.question19.dao.PersonDaoImpl;
import com.spring.professional.exam.tutorial.module01.question19.ds.Person;

public class Runner {
	
	public static void main(String[] args) {
		PersonDao personDao = (PersonDao)Proxy.newProxyInstance(PersonDao.class.getClassLoader(), 
				PersonDaoImpl.class.getInterfaces(),new PersonDaoInvocationHandler(new PersonDaoImpl()));
		
		personDao.findById("5");
		personDao.savePerson(new Person());
	}

}
