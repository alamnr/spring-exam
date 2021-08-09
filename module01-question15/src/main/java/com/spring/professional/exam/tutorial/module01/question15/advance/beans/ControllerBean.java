package com.spring.professional.exam.tutorial.module01.question15.advance.beans;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerBean {
	
	public ControllerBean() {
		System.out.println( getClass().getSimpleName()+" :: Constructor");
	}

}
