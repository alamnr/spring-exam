package com.spring.professional.exam.tutorial.module01.question03.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question03.dao.FinancialDataDao;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialYearSummary;
import com.spring.professional.exam.tutorial.module01.question03.writer.FinancialReportWriter;

@Component("SimpleFinancialReportService")
class SimpleFinancialReportService {
    private final FinancialDataDao financialDataDao;
    private final FinancialReportWriter financialReportWriter;

    SimpleFinancialReportService(@Qualifier("database-dao")FinancialDataDao financialDataDao, @Qualifier("database-writer") FinancialReportWriter financialReportWriter) {
        this.financialDataDao = financialDataDao;
        this.financialReportWriter = financialReportWriter;
    }

    void generateReport() {
        FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2019);

        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
    }
}
