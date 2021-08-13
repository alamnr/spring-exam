package com.spring.professional.exam.tutorial.module01.question19.proxy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public SpringBean springBean() {
		System.out.println("Creating Spring bean ... " + getClass().getSimpleName());
		return new SpringBean();
	}
}
