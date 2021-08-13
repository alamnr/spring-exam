package com.spring.professional.exam.tutorial.module01.question22;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question22.beans.SpringBean1;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		context.registerShutdownHook();
		
		System.out.println("Printing bean names : ");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println("Fetching bean by alias: " );
		System.out.println(context.getBean("thirdSpringBean").getClass().getSimpleName());
		System.out.println(context.getBean(SpringBean1.class));
		System.out.println(context.getBean(SpringBean1.class));
	}

}
