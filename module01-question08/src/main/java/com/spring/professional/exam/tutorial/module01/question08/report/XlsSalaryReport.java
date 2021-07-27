package com.spring.professional.exam.tutorial.module01.question08.report;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question08.ds.EmployeeSalary;

@Component
public class XlsSalaryReport implements SalaryReport {
	
	public void writeReport(List<EmployeeSalary> employeeSalaries){
		System.out.println(" Writing Xls Report ");
	}
}
