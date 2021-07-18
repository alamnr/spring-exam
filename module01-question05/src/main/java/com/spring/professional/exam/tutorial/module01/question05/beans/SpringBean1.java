package com.spring.professional.exam.tutorial.module01.question05.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
	
	private SpringBean3 springBean3;
	private SpringBean2 springBean2;
	
	public SpringBean1() {
		System.out.println(getClass().getSimpleName()+":: constructor");
	}
	
	
	@Autowired
	public void setSpringBean3(SpringBean3 springBean3) {
		System.out.println(getClass().getSimpleName()+" ::  set SpringBean3");
		this.springBean3 = springBean3;
	}


	@Autowired
	public void setSpringBean2(SpringBean2 springBean2) {
		System.out.println(getClass().getSimpleName()+" :: set SpringBean2");
		this.springBean2 = springBean2;
	}



	@PostConstruct
	public void init() {
		System.out.println(getClass().getSimpleName()+":: init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println(getClass().getSimpleName()+":: destroy");
	}

}
