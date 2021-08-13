package com.spring.professional.exam.tutorial.module01.question19.dao;

import com.spring.professional.exam.tutorial.module01.question19.ds.Person;

public interface PersonDao {
	
	Person findById(String id);
	void savePerson(Person person);

}
