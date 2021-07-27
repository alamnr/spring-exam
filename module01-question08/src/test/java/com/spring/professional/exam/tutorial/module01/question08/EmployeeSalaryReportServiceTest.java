package com.spring.professional.exam.tutorial.module01.question08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.professional.exam.tutorial.module01.question08.service.EmployeesSalariesReportService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class EmployeeSalaryReportServiceTest {
	@Autowired
	EmployeesSalariesReportService employeesSalariesReportService;
	
	@Test
	public void shouldGenerateReport() {
		employeesSalariesReportService.generateReport();
		// assertion
	}

}
