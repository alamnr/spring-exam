package com.spring.professional.exam.tutorial.module01.question14.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean4 {
	
	public  SpringBean4() {
		System.out.println(" Constructing springBean4 ");
	}

	
	@PostConstruct
	public void postConstruct() {
		System.out.println(getClass().getSimpleName()+" ::postConstruct ");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println(getClass().getSimpleName()+" ::preDestroy ");
	}

}
