package com.spring.professional.exam.tutorial.module01.question05.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {
	
	public SpringBean2() {
		System.out.println(getClass().getSimpleName()+":: constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println(getClass().getSimpleName()+":: init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println(getClass().getSimpleName()+":: detroy");
	}

}
