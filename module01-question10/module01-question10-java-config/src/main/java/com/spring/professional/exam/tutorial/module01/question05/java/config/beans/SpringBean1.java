package com.spring.professional.exam.tutorial.module01.question05.java.config.beans;

public class SpringBean1 {
	
	private SpringBean2 springBean2;
	private SpringBean3 springBean3;
	
	public SpringBean1(SpringBean2 springBean2, SpringBean3 springBean3) {
		this.springBean2 = springBean2;
		this.springBean3 = springBean3;
		System.out.println(getClass().getSimpleName() + " :: Constructor");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

}
