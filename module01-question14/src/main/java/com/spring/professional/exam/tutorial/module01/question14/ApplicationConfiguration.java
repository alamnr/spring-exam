package com.spring.professional.exam.tutorial.module01.question14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.spring.professional.exam.tutorial.module01.question14.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question14.beans.SpringBean2;
import com.spring.professional.exam.tutorial.module01.question14.beans.SpringBean3;
import com.spring.professional.exam.tutorial.module01.question14.beans.SpringBean4;


//@ComponentScan
public class ApplicationConfiguration {
	
	@Bean
	public static CustomBeanPostProcessor customBeanPostProcessor() {
		return new CustomBeanPostProcessor();
	}
	
	@Bean(initMethod = "initMethod")
	public SpringBean1 springBean1() {
		return new  SpringBean1();
	}
	
	@Bean(destroyMethod = "destroyMethod")
	public SpringBean2 springBean2() {
		return new SpringBean2();
	}
	
	@Bean
	public SpringBean3 springBean3() {
		return new SpringBean3();
	}
	
	@Bean
	public SpringBean4 springBean4() {
		return new SpringBean4();
	}
	


}
