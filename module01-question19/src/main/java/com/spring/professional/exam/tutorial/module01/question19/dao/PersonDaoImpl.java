package com.spring.professional.exam.tutorial.module01.question19.dao;

import com.spring.professional.exam.tutorial.module01.question19.ds.Person;

public class PersonDaoImpl implements PersonDao{

	@Override
	public Person findById(String id) {
		System.out.println("finding person by id ");
		return new Person();
	}

	@Override
	public void savePerson(Person person) {
		System.out.println("Saving Person");
				
	}

}
