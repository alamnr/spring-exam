package com.spring.professional.exam.tutorial.module01.question19.proxy.manual;

import com.spring.professional.exam.tutorial.module01.question19.dao.PersonDao;
import com.spring.professional.exam.tutorial.module01.question19.ds.Person;

public class PersonDaoProxy  implements PersonDao   {
	
	private final PersonDao personDao;
	
	public PersonDaoProxy(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public Person findById(String id) {
		System.out.println("Before  find by id");
		Person person = personDao.findById(id);
		System.out.println("After find by id");
		return person ;
	}

	@Override
	public void savePerson(Person person) {
		System.out.println("Before saving person");
		personDao.savePerson(person);
		System.out.println("After saving person");
	}

}
