package com.spring.professional.exam.tutorial.module01.question08.report;

import java.util.List;

import com.spring.professional.exam.tutorial.module01.question08.ds.EmployeeSalary;

public interface SalaryReport {
	public void	writeReport(List<EmployeeSalary> employeeSalaries);
}
