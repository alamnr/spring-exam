package com.spring.professional.exam.tutorial.module01.question13;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@Configuration
@PropertySource("classpath:/app-defaults.properties")
public class ApplicationConfiguration {

	@Bean
	public static CustomBeanFactoryPostProcessor custBeanFactoryPostProcessor() {
		return new CustomBeanFactoryPostProcessor();
	}

}
