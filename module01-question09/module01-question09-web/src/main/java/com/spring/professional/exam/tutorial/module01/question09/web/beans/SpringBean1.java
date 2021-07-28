package com.spring.professional.exam.tutorial.module01.question09.web.beans;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
	
	public String sayHello() {
		return "Hello";
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println(" @Predestroy " + getClass().getSimpleName());
	}

}
