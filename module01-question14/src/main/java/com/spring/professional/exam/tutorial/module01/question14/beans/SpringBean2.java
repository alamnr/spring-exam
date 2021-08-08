package com.spring.professional.exam.tutorial.module01.question14.beans;

import javax.annotation.PostConstruct;

public class SpringBean2 {
	
	public  SpringBean2() {
		System.out.println(" Constructing springBean2 ");
	}
	
	public void destroyMethod() {
		System.out.println( getClass().getSimpleName()+" ::destroyMethod ");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println( getClass().getSimpleName()+" ::postConstruct / init ");
	}

}
