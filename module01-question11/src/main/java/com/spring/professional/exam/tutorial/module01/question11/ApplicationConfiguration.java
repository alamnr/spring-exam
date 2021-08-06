package com.spring.professional.exam.tutorial.module01.question11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question11.beans.SpringBean7;
import com.spring.professional.exam.tutorial.module01.question11.beans.SpringBean8;

@ComponentScan
//@ComponentScan(lazyInit = true)
@Configuration
//@Lazy
public class ApplicationConfiguration {

	@Bean
	@Lazy
	public SpringBean7 getSpringBean7() {
		return new SpringBean7();
	}
	
	@Bean
	//@Lazy(false)
	public SpringBean8 getSpringBean8() {
		return new SpringBean8();
	}
}
