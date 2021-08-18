package com.spring.professional.exam.tutorial.module01.question34;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question34.beans.SpringBean;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		context.register(ApplicationConfiguration.class);
		context.refresh();
		
		System.out.println(context.getBean(SpringBean.class).toString());
		
	}

}
