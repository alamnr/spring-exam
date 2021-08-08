package com.spring.professional.exam.tutorial.module01.question14;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println( bean.getClass().getSimpleName()+" ::postProcessBeforeInitialization  " );
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println( bean.getClass().getSimpleName() + " ::postProcessAfterInitialization " );
		return bean;
	}
	

}
