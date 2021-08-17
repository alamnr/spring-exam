package com.spring.professional.exam.tutorial.module01.question32;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question32.beans.SpringBean;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		
		context.register(ApplicationConfig.class);
		context.refresh();
		
		System.out.println(context.getEnvironment().getProperty("app.file.property"));
		System.out.println(context.getEnvironment().getProperty("app.vm.property"));
		System.out.println(context.getEnvironment().getProperty("app.env.property"));
		System.out.println(context.getEnvironment().getProperty("user.home"));
		System.out.println(context.getEnvironment().getProperty("JAVA_HOME"));
		System.out.println(context.getEnvironment().getProperty("MAVEN_HOME"));
		
		System.out.println(context.getBean(SpringBean.class).toString());
				
	}

}
