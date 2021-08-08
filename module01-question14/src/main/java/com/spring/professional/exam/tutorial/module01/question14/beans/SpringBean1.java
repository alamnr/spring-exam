package com.spring.professional.exam.tutorial.module01.question14.beans;

import org.springframework.beans.factory.DisposableBean;

public class SpringBean1 implements DisposableBean {
	
	public  SpringBean1() {
		System.out.println(" Constructing springBean1 ");
	}
	
	public void initMethod() {
		System.out.println( getClass().getSimpleName()+" ::initMethod ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println( getClass().getSimpleName()+" ::Disposable destroy ");
		
	}

}
