package com.spring.professional.exam.tutorial.module01.question21.beans;

public class SpringBean2 {
	
	public void destroy() {
		System.out.println(getClass().getSimpleName()+ " :: destroy");
	}

}
