package com.spring.professional.exam.tutorial.module01.question11.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Lazy(false)
public class SpringBean3 {
	
	public SpringBean3() {
		System.out.println(" Creating " +getClass().getSimpleName()+ " - Prototype bean");
	}
}
