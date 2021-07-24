package com.spring.professional.exam.tutorial.module01.question06.non.web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.AnnotationConfigurationException;

import com.spring.professional.exam.tutorial.module01.question06.non.web.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question06.non.web.defined.configuration.ConfigurationStatic;

public class AnnotationConfigApplicationContextExample1b {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationStatic.class);
		SpringBean1 springBean1 = context.getBean(SpringBean1.class);
		springBean1.sayHello();
	}

}
