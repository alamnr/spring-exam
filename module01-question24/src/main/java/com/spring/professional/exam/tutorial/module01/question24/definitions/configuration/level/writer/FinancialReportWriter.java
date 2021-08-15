package com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.writer;

import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.ds.FinancialYearSummary;

public interface FinancialReportWriter {
	
	void appendFreetext(String  tilte);
	
	void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);
	
	void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);
	
	void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary);

}
