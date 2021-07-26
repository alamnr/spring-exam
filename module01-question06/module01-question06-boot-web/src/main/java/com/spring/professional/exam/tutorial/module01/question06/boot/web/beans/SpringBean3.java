package com.spring.professional.exam.tutorial.module01.question06.boot.web.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SpringBean3 {

	public SpringBean3() {
		System.out.println(getClass().getSimpleName()+ " :: Constructor ");
	}
	
	@PostConstruct
	public void init() {
		System.out.println(getClass().getSimpleName()+" :: Init ");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println(getClass().getSimpleName()+" :: Destroy");
	}
}
