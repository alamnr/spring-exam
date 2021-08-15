package com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.writer;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.annotations.DatabaseProfile;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialYearSummary;

@Component
@DatabaseProfile
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
