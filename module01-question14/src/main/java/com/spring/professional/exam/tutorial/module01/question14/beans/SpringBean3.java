package com.spring.professional.exam.tutorial.module01.question14.beans;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;

public class SpringBean3 implements InitializingBean {
	
	public  SpringBean3() {
		System.out.println(" Constructing springBean3 ");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println( getClass().getSimpleName()+" ::afterPropertiesSet ");
		
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println( getClass().getSimpleName() + " ::preDestroy ");
	}

}
