package com.spring.professional.exam.tutorial.module01.question08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question08.service.EmployeesSalariesReportService;

public class Runner {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)){
			EmployeesSalariesReportService employeesSalariesReportService = context.getBean(EmployeesSalariesReportService.class);
			employeesSalariesReportService.generateReport();
		}
	}

}
