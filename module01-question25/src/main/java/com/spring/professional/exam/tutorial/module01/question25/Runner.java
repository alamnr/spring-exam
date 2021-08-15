package com.spring.professional.exam.tutorial.module01.question25;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question25.beans.DataMapper;
import com.spring.professional.exam.tutorial.module01.question25.beans.DataProcessor;
import com.spring.professional.exam.tutorial.module01.question25.beans.DataReader;
import com.spring.professional.exam.tutorial.module01.question25.beans.DataWriter;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		
		// Activate Profile
		context.getEnvironment().setActiveProfiles("database","prod");
		context.register(ApplicationConfig.class);
		context.refresh();
		
		System.out.println(context.getBean(DataMapper.class).getClass().getSimpleName());
		System.out.println(context.getBean(DataProcessor.class).getClass().getSimpleName());
		System.out.println(context.getBean(DataReader.class).getClass().getSimpleName());
		System.out.println(context.getBean(DataWriter.class).getClass().getSimpleName());
	}

}
