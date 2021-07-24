package com.spring.professional.exam.tutorial.module01.question06.non.web.beans;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ConfigurationComponentScan {
	
	@Bean
	public BeanFactoryPostProcessor getBeanFactoryPostProcessor() {
		return new CustomBeanFactoryPostProcessor();
	}
	
	@Bean
	public BeanPostProcessor getBeanPostProcessor() {
		return new CustomBeanPostProcessor();
	}
	
}
