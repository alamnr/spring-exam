package com.spring.professional.exam.tutorial.module01.question06.non.web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question06.non.web.beans.SpringBean1;

public class AnnotationConfigApplicationContextExample3 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.spring.professional.exam.tutorial.module01.question06.non.web.beans");
		context.refresh();
		SpringBean1 bean1 = context.getBean(SpringBean1.class);
		bean1.sayHello();
	}

}
