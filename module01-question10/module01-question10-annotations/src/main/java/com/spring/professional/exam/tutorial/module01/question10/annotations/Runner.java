package com.spring.professional.exam.tutorial.module01.question10.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question10.annotations.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question10.annotations.beans.SpringBean2;

public class Runner {
	
	public static void main(String[] srgs) {
		//AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(ApplicationConfigurationAdvance.class);
		context.registerShutdownHook();
		
		/*
		 * SpringBean1 springBean1 = context.getBean(SpringBean1.class);
		 * springBean1.sayHello();
		 */
		
			
	}

}
