package com.spring.professional.exam.tutorial.module01.question10.annotations.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
	
	@Autowired
	private final SpringBean2 springBean2;
	
	@Autowired
	private final  SpringBean3 springBean3;
	
	//@Autowired
	public SpringBean1(SpringBean2 springBean2, SpringBean3 springBean3) {
		this.springBean2 = springBean2;
		this.springBean3 = springBean3;
		System.out.println(getClass().getSimpleName()+" :: Constructor ");
	}
	
	public void sayHello() {
		System.out.println(" Hello ");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println(String.format("%s is constructed wwith %s and %s", getClass().getSimpleName(),springBean2.getClass().getSimpleName(),springBean3.getClass().getSimpleName()));
	}

}
