package com.spring.professional.exam.tutorial.module01.question19.proxy.manual;

import com.spring.professional.exam.tutorial.module01.question19.dao.PersonDao;
import com.spring.professional.exam.tutorial.module01.question19.dao.PersonDaoImpl;
import com.spring.professional.exam.tutorial.module01.question19.ds.Person;

public class Runner {
	
	public static void main(String[] args) {
		PersonDao personDao;
		//personDao = new PersonDaoImpl();
		personDao = new PersonDaoProxy(new PersonDaoImpl()); 
		
		personDao.findById("2");
		personDao.savePerson(new Person());
		
	}

}
