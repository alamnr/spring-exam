package com.spring.professional.exam.tutorial.module01.question19.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.spring.professional.exam.tutorial.module01.question19.dao.PersonDao;

public class PersonDaoInvocationHandler implements InvocationHandler {
	
	private final PersonDao target;
	
	public PersonDaoInvocationHandler(PersonDao personDao) {
		this.target = personDao;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before "+ method.getName());
		Object result = method.invoke(target, args);
		System.out.println("After "+method.getName());
		return result;
	}

}
