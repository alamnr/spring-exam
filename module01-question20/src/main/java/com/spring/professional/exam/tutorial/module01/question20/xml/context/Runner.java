package com.spring.professional.exam.tutorial.module01.question20.xml.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.professional.exam.tutorial.module01.question20.xml.context.beans.SpringBean1;

public class Runner {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
		context.getBean(SpringBean1.class).printDependency();
	}

}
