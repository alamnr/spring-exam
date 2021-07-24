package com.spring.professional.exam.tutorial.module01.question06.non.web;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.professional.exam.tutorial.module01.question06.non.web.beans.SpringBean1;

public class FileSystemXmlApplicationContextExample {
	
	public static void main(String[] args) {
		String beansXmlLocationOnFileSystem = FileSystemXmlApplicationContext.class.getResource("/beans.xml").toExternalForm();
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(beansXmlLocationOnFileSystem);
		SpringBean1 bean = context.getBean(SpringBean1.class);
		bean.sayHello();
	}

}
