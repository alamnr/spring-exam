package com.spring.professional.exam.tutorial.module01.question01.spring.dependency.injection;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.professional.exam.tutorial.module01.question01.commons.bls.EmployeeSalaryCalculator;
import com.spring.professional.exam.tutorial.module01.question01.commons.dao.EmployeeDao;
import com.spring.professional.exam.tutorial.module01.question01.commons.ds.Employee;
import com.spring.professional.exam.tutorial.module01.question01.commons.ds.EmployeeSalary;
import com.spring.professional.exam.tutorial.module01.question01.commons.report.SalaryReport;

@Service
public class EmployeeSalariesReportService {
	
	private final EmployeeDao employeeDao;
	private final EmployeeSalaryCalculator employeeSalaryCalculator;
	private final SalaryReport  salaryReport;
	
	public EmployeeSalariesReportService(EmployeeDao employeeDao, EmployeeSalaryCalculator employeeSalaryCalculator,
			SalaryReport salaryReport) {
		super();
		this.employeeDao = employeeDao;
		this.employeeSalaryCalculator = employeeSalaryCalculator;
		this.salaryReport = salaryReport;
	}
	
	public void generateReport() {
		List<Employee> employees = employeeDao.findAll();
		
		List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);
		
		salaryReport.writeReport(employeeSalaries);
	}

}
