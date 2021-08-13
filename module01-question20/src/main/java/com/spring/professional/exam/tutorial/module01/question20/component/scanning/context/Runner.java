package com.spring.professional.exam.tutorial.module01.question20.component.scanning.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.professional.exam.tutorial.module01.question20.component.scanning.context.beans.SpringBean1;

@ComponentScan
public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);
		context.registerShutdownHook();
		
		context.getBean(SpringBean1.class).printDependencies();
	}
}
