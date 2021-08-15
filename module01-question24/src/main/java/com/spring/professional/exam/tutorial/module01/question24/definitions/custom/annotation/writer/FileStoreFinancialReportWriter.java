package com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.writer;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.annotations.FileProfile;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialYearSummary;

@Component
@FileProfile
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
