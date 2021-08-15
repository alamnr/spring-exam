package com.spring.professional.exam.tutorial.module01.question24.activations.vm.property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question24.activations.vm.property.dao.FinancialDataDao;



public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		
		// Profile should be activated with vm property -Dspring.profiles.active=database
		context.register(ApplicationConfig.class);
		context.refresh();
		
		FinancialDataDao financialDataDao = context.getBean(FinancialDataDao.class);
		System.out.println(financialDataDao.getClass().getSimpleName());
	}

}
