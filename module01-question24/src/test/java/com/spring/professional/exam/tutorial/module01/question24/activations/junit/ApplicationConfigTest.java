package com.spring.professional.exam.tutorial.module01.question24.activations.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.professional.exam.tutorial.module01.question24.activations.junit.ApplicationConfig;
import com.spring.professional.exam.tutorial.module01.question24.activations.junit.dao.FinancialDataDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@ActiveProfiles("database")
public class ApplicationConfigTest {
	
	@Autowired
	private FinancialDataDao financialDataDao;

	@Test
	public void shouldTestFinancialDataDao() {
		System.out.println("Will perform test on "+ financialDataDao.getClass().getSimpleName());
	}
}
