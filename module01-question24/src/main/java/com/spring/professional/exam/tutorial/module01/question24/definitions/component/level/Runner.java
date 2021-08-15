package com.spring.professional.exam.tutorial.module01.question24.definitions.component.level;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question24.definitions.component.level.service.FinancialReportService;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.registerShutdownHook();
		
		// Activate profile
		
		context.getEnvironment().setActiveProfiles("file");
		context.register(ApplicationConfiguration.class);
		context.refresh();
		
		FinancialReportService financialReportService = context.getBean(FinancialReportService.class);
		financialReportService.generateReport();
		
	}

}
