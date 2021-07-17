package com.spring.professional.exam.tutorial.module01.question03.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question03.dao.FinancialDataDao;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialYearSummary;
import com.spring.professional.exam.tutorial.module01.question03.writer.FinancialReportWriter;

@Component
public class FinancialReportService {
	
	private final FinancialDataDao financialDataDao;
	private final  FinancialReportWriter financialReportWriter;
	public FinancialReportService(@Qualifier("file-dao")FinancialDataDao financialDataDao, @Qualifier("file-writer")
			FinancialReportWriter financialReportWriter) {
		super();
		this.financialDataDao = financialDataDao;
		this.financialReportWriter = financialReportWriter;
	}
	
	public void generateReport() {
		FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2021);
		FinancialQuarterSummary financialQuarterSummary = financialDataDao.findFinancialQuarterSummary(2021, 2);
		FinancialMonthSummary financialMonthSummary = financialDataDao.findfFinancialMonthSummary(2021, 6);
		
		financialReportWriter.appendFreeText("Year / Quarter / Month Financial Report");
		financialReportWriter.appendFinancialYearSummary(financialYearSummary);
		financialReportWriter.appendFinancialQuarterSummary(financialQuarterSummary);
		financialReportWriter.appendFinancialMonthSummary(financialMonthSummary);
		
		 
	}
	

}
