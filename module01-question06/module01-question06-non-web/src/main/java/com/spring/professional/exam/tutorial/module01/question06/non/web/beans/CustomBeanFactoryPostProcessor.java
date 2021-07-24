package com.spring.professional.exam.tutorial.module01.question06.non.web.beans;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println(getClass().getSimpleName()+" :: BeanFactoryPostProcessor listing beans start");
		Arrays.stream(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(getClass().getSimpleName()+":: BeanFactoryPostProcessor listing beans end");
	}

}
