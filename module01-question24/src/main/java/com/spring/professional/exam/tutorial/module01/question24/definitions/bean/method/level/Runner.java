package com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.service.FinancialReportService;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		
		context.getEnvironment().setActiveProfiles("file");
		context.register(ApplicationConfig.class);
		context.refresh();
		
		context.getBean(FinancialReportService.class).generateReport();
	}

}
