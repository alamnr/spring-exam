package com.spring.professional.exam.tutorial.module01.question11.beans;

import org.springframework.stereotype.Component;


public class SpringBean7 {
	public SpringBean7() {
		System.out.println(" Creating "+ getClass().getSimpleName() + " - Bean from configuration class ");
	}
}
