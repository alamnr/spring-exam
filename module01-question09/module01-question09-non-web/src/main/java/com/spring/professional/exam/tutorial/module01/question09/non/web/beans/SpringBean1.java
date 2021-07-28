package com.spring.professional.exam.tutorial.module01.question09.non.web.beans;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
	
	public void sayHello() {
		System.out.println(" Hello ");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println(" @PreDestroy " + getClass().getSimpleName());
	}

}
