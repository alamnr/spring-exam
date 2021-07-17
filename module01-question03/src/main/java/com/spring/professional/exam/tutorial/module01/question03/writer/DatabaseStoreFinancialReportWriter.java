package com.spring.professional.exam.tutorial.module01.question03.writer;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialYearSummary;

@Component("database-writer")
class DatabaseStoreFinancialReportWriter implements FinancialReportWriter {

	@Override
	public void appendFreeText(String title) {
		System.out.println("Database Writer -->> Append Free Text");

	}

	@Override
	public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
		System.out.println("Database Writer -->> Financial Year Summary ");

	}

	@Override
	public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
		System.out.println("Database writer -->> Financial Quarter Summary");

	}

	@Override
	public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
		System.out.println("Database Writer -->> Financial Month Summary");

	}

}
