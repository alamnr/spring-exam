package com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.writer;

import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.ds.FinancialYearSummary;

public interface FinancialReportWriter {
	
	void appendFreetext(String  tilte);
	
	void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);
	
	void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);
	
	void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary);

}
