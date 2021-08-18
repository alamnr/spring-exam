package com.spring.professional.exam.tutorial.module01.question33;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.spring.professional.exam.tutorial.module01.question33.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question33.beans.SpringBean2;



public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		
		context.register(ApplicationConfig.class);
		context.refresh();
		
		ExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext evaluationContext = new StandardEvaluationContext();
		evaluationContext.setBeanResolver(new BeanFactoryResolver(context));
		
		SpringBean1 springBean1 = context.getBean(SpringBean1.class);
		
		System.out.println(springBean1.toString());
		
		evaluationContext.setVariable("firstName", "John");
		evaluationContext.setVariable("objectRef", context.getBean(SpringBean2.class));
		
		System.out.println("#firstName: "+ parser.parseExpression("#firstName").getValue(evaluationContext));
		System.out.println("#objectRef.property: "+ parser.parseExpression("#objectRef.property").getValue(evaluationContext));
		System.out.println("#objectRef.method(): " + parser.parseExpression("#objectRef.method()").getValue(evaluationContext));
	}

}
