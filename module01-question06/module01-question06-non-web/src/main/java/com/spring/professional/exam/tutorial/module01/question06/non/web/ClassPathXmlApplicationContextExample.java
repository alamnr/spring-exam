package com.spring.professional.exam.tutorial.module01.question06.non.web;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.professional.exam.tutorial.module01.question06.non.web.beans.SpringBean1;

public class ClassPathXmlApplicationContextExample {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
		SpringBean1 bean = context.getBean(SpringBean1.class);
		bean.sayHello();
	}

}
