package com.spring.professional.exam.tutorial.module01.question21.beans;

import java.security.MessageDigest;

public class SpringBean3A  implements SpringBean3{
	
	private final MessageDigest messageDigest;
	
	public SpringBean3A(MessageDigest messageDigest) {
		this.messageDigest = messageDigest;
	}

}
