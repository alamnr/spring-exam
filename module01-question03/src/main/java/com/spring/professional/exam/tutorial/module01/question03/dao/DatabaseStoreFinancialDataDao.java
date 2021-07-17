package com.spring.professional.exam.tutorial.module01.question03.dao;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialMonthSummary;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialQuarterSummary;
import com.spring.professional.exam.tutorial.module01.question03.ds.FinancialYearSummary;

@Component("database-dao")
class DatabaseStoreFinancialDataDao implements FinancialDataDao {

	@Override
	public FinancialYearSummary findFinancialYearSummary(int year) {
		System.out.println("Database Dao -->> FinancialYearSummary");
		return new FinancialYearSummary();
	}

	@Override
	public FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter) {
		System.out.println("Database Dao -->> FinancialQuarterSummary");
		return new FinancialQuarterSummary();
	}

	@Override
	public FinancialMonthSummary findfFinancialMonthSummary(int year, int month) {
		System.out.println("Database Dao -->> FinancialMonthSummary");
		return new FinancialMonthSummary();
	}

}
