package com.spring.professional.exam.tutorial.module01.question08.dao;


import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question08.ds.Employee;

@Component
public class EmployeeDao {
	
	public List<Employee> findAll(){
		System.out.println(" Finding all Employees");
		return Collections.emptyList();		
	}

}
