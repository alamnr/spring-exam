package com.spring.professional.exam.tutorial.module01.question08.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.professional.exam.tutorial.module01.question08.bls.EmployeeSalaryCalculator;
import com.spring.professional.exam.tutorial.module01.question08.dao.EmployeeDao;
import com.spring.professional.exam.tutorial.module01.question08.ds.Employee;
import com.spring.professional.exam.tutorial.module01.question08.ds.EmployeeSalary;
import com.spring.professional.exam.tutorial.module01.question08.report.SalaryReport;

@Service
public class EmployeesSalariesReportService {
	private final EmployeeDao employeeDao;
	private final EmployeeSalaryCalculator employeeSalaryCalculator;
	private final SalaryReport salaryReport;
	
	public EmployeesSalariesReportService(EmployeeDao employeeDao, EmployeeSalaryCalculator employeeSalaryCalculator,
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
