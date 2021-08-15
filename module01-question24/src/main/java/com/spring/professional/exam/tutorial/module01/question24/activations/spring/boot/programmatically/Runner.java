package com.spring.professional.exam.tutorial.module01.question24.activations.spring.boot.programmatically;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.spring.professional.exam.tutorial.module01.question24.activations.spring.boot.programmatically.dao.FinancialDataDao;



@SpringBootApplication
public class Runner implements CommandLineRunner {
	
	@Autowired
	private FinancialDataDao financialDataDao;
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(Runner.class)
			.profiles("file")
			.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(financialDataDao.getClass().getSimpleName());
		
	}

}
