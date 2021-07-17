package com.spring.professional.exam.tutorial.module01.question03.writer;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialYearSummary;

@Component("file-writer")
class FileStoreFinancialReportWriter implements  FinancialReportWriter {

	@Override
	public void appendFreeText(String title) {
		System.out.println("File Writer -->> append free text");
		
	}

	@Override
	public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
		System.out.println("File Writer -->> Financial Year Summary");
		
	}

	@Override
	public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
		System.out.println("File Writer -->> Financial Quarter Summary");
		
	}

	@Override
	public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
		System.out.println("File Writer -->> Financial Month Summary");
		
	}
	
	

}
