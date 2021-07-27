package com.spring.professional.exam.tutorial.module01.question07.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringBean1 {
	private SpringBean2 springBean2;
	
	public SpringBean1() {
		System.out.println("Creating " + getClass().getSimpleName());
	}
	
	public void sayHello() {
		System.out.println("Hello from Spring bean1");
	}

	@Autowired
	public void setSpringBean2(SpringBean2 springBean2) {
		this.springBean2 = springBean2;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("@PostConstruct "+ getClass().getSimpleName());
	}
	
	public void preDestroy() {
		System.out.println("@PreDestroy " + getClass().getSimpleName());
	}
	
	private void initMethod() {
        System.out.println("@Bean(initMethod) " + getClass().getSimpleName());
    }

    private void destroyMethod() {
        System.out.println("@Bean(destroyMethod) " + getClass().getSimpleName());
    }
	

}
