package com.spring.professional.exam.tutorial.module01.question04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question04.beans.Car;

public class Runner {

	public static void main(String... args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Car car = context.getBean(Car.class);
		car.drive();
	}
}
