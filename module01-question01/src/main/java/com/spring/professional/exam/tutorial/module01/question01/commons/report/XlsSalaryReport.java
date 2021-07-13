package com.spring.professional.exam.tutorial.module01.question01.commons.report;

import com.spring.professional.exam.tutorial.module01.question01.commons.ds.EmployeeSalary;


import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("xls-reports")
public class XlsSalaryReport implements SalaryReport {
    public void writeReport(List<EmployeeSalary> employeeSalaries) {
        System.out.println("Writing Xls Report");
    }
}
