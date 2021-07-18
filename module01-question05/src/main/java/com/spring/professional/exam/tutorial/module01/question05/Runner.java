package com.spring.professional.exam.tutorial.module01.question05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question05.beans.SpringBean1;

public class Runner {
	
	public static void main(String... args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfuguration.class);
		SpringBean1 springBean1 = context.getBean(SpringBean1.class);
	}

}
