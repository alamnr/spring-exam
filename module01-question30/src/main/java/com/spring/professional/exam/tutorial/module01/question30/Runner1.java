package com.spring.professional.exam.tutorial.module01.question30;

import java.util.Arrays;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Runner1 {
	
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		
		System.out.println(parser.parseExpression("'Hello'.concat(' world!')").getValue());
		System.out.println(parser.parseExpression("'2 + 2 equals = '.concat(2+2)").getValue());
		System.out.println(parser.parseExpression("new String('Wall Street').toUpperCase()").getValue());
		System.out.println(parser.parseExpression("14*60").getValue());
		System.out.println(parser.parseExpression("{1,2,3}").getValue());
		System.out.println(parser.parseExpression("{a:1,b:2,c:3}").getValue());
		System.out.println(parser.parseExpression("5<10").getValue());
		System.out.println(Arrays.toString((int[])  parser.parseExpression("new int[]{1,2,3}").getValue()));
	}

}
