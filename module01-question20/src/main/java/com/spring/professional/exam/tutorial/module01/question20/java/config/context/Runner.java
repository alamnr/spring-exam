package com.spring.professional.exam.tutorial.module01.question20.java.config.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question20.java.config.context.beans.SpringBean1;

public class Runner {
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		context.registerShutdownHook();
		
		context.getBean(SpringBean1.class).printDependencies();
	}
	

}
