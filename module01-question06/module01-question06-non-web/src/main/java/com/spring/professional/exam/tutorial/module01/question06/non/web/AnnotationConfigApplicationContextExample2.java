package com.spring.professional.exam.tutorial.module01.question06.non.web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question06.non.web.beans.SpringBean1;

public class AnnotationConfigApplicationContextExample2 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.professional.exam.tutorial.module01.question06.non.web.beans");
		SpringBean1 bean1 = context.getBean(SpringBean1.class);
		bean1.sayHello();
	}

}
