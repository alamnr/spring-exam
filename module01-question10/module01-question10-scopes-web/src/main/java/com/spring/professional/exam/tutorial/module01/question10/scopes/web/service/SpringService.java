package com.spring.professional.exam.tutorial.module01.question10.scopes.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.professional.exam.tutorial.module01.question10.scopes.web.beans.SpringBeanApplication;
import com.spring.professional.exam.tutorial.module01.question10.scopes.web.beans.SpringBeanProtoType;
import com.spring.professional.exam.tutorial.module01.question10.scopes.web.beans.SpringBeanRequest;
import com.spring.professional.exam.tutorial.module01.question10.scopes.web.beans.SpringBeanSession;
import com.spring.professional.exam.tutorial.module01.question10.scopes.web.beans.SpringBeanSingleton;

@Service
public class SpringService {
	
	@Autowired
	private SpringBeanSingleton springBeanSingleton;
	
	@Autowired
	private SpringBeanSingleton springBeanSingleton2;
	
	@Autowired
	private SpringBeanProtoType springBeanProtoType;	
	@Autowired
	private SpringBeanProtoType springBeanProtoType2;	
	
	
	@Autowired
	private SpringBeanRequest springBeanRequest;
	@Autowired
	private SpringBeanSession springBeanSession;
	
	@Autowired
	private SpringBeanApplication springBeanApplication;
	
	public String getBeanScopes() {
		StringBuilder scopes = new StringBuilder().append(springBeanSingleton+" - SpringBeanSingleton- " + "<br>");
		scopes.append(springBeanSingleton2+" - SpringBeanSingleton- " + "<br>");
		
		scopes.append(springBeanProtoType+ " - SpringBeanProtoType- " + "<br>");
		
		scopes.append(springBeanProtoType2+ " - SpringBeanProtoType- " + "<br>");
		
		scopes.append(springBeanRequest+" - SpringBeanRequest- " + "<br>");
		
		scopes.append( springBeanSession+" - SpringBeanSession- " +"<br>");
		scopes.append( springBeanApplication+" - SpringBeanApplication- " +"<br>");
		
		return scopes.toString();
		
		
	}

}
