package com.spring.junit.mockito.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.junit.mockito.example.service.ReportService;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		context.registerShutdownHook();
		
		context.getBean(ReportService.class).write();
	}

}
