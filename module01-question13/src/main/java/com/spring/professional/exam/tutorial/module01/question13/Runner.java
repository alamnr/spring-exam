package com.spring.professional.exam.tutorial.module01.question13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question13.beans.PropertyReadingBean;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		context.registerShutdownHook();
		
		//context.getBean(PropertyReadingBean.class).printProperties();
	}

}