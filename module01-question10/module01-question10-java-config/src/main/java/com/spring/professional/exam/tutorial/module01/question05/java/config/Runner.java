package com.spring.professional.exam.tutorial.module01.question05.java.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question05.java.config.beans.SpringBean1;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		context.registerShutdownHook();
		
		SpringBean1 springBean1 = context.getBean(SpringBean1.class);
		springBean1.sayHello();
	}

}
