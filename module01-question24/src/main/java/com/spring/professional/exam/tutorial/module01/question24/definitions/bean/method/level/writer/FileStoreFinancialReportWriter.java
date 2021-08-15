package com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.writer;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.ds.FinancialYearSummary;


public class FileStoreFinancialReportWriter implements FinancialReportWriter{

	@Override
	public void appendFreetext(String tilte) {
		System.out.println("File writer => appendFreetext");
		
	}

	@Override
	public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
		System.out.println("File writer => appendFinancialYearSummary");
		
	}

	@Override
	public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
		System.out.println("File writer => appendFinancialQuarterSummary");
		
	}

	@Override
	public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
		System.out.println("File writer => appendFinancialMonthSummary");
		
	}

}
