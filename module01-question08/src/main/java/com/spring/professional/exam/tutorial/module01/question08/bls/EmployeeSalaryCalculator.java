package com.spring.professional.exam.tutorial.module01.question08.bls;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question08.ds.Employee;
import com.spring.professional.exam.tutorial.module01.question08.ds.EmployeeSalary;

@Component
public class EmployeeSalaryCalculator {
	
	public List<EmployeeSalary> calculateSalaries(List<Employee> employees) {
		System.out.println(" Calculating salaries ");
		return Collections.emptyList();
	}

}
