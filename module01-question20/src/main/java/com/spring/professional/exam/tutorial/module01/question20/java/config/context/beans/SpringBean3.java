package com.spring.professional.exam.tutorial.module01.question20.java.config.context.beans;

import java.security.MessageDigest;

public class SpringBean3 {
	
	private final MessageDigest messageDigest;
	
	public SpringBean3(MessageDigest messageDigest) {
		this.messageDigest = messageDigest;
	}

}
