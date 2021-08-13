package com.spring.professional.exam.tutorial.module01.question23;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.professional.exam.tutorial.module01.question23.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question23.beans.SpringBean2;

@Configuration
public  class ApplicationConfig {
	
	
	public ApplicationConfig() {
		System.out.println("Creating CGLIB Proxy -  " + getClass().getSimpleName());
	}
	@Bean
	public SpringBean1 springBean1() {
		System.out.println("Creating - " + SpringBean1.class.getSimpleName());
		return new SpringBean1();
	}
	
	@Bean
	@Scope("prototype")
	public SpringBean2 springBean2() {
		System.out.println("Creating - "+ SpringBean2.class.getSimpleName());
		return new SpringBean2();
	}
}
