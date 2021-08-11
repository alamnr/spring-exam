package com.spring.professional.exam.tutorial.module01.question17;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question17.service.ReportService;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		context.registerShutdownHook();
		
		context.getBean(ReportService.class).execute();
	}
	

}
