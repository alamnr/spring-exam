package com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.writer;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialYearSummary;


public class DatabaseStoreFinancialReportWriter implements FinancialReportWriter {

	@Override
	public void appendFreetext(String tilte) {
		System.out.println("Database writer => appendFreetext");
		
	}

	@Override
	public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
		System.out.println("Database writer => appendFinancialYearSummary");
		
	}

	@Override
	public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
		System.out.println("Database writer => appendFinancialQuarterSummary");
		
	}

	@Override
	public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
		System.out.println("Database writer => appendFinancialMonthSummary");
		
	}

}
