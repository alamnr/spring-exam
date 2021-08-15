package com.spring.professional.exam.tutorial.module01.question24.activations.programmatically;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question24.activations.programmatically.dao.DatabaseStoreFinancialDataDao;
import com.spring.professional.exam.tutorial.module01.question24.activations.programmatically.dao.FinancialDataDao;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		
		context.getEnvironment().setActiveProfiles("file");
		context.register(ApplicationConfig.class);
		context.refresh();
		
		FinancialDataDao financialDataDao = (FinancialDataDao) context.getBean(FinancialDataDao.class);
		 System.out.println(financialDataDao.getClass().getSimpleName());
	}

}
