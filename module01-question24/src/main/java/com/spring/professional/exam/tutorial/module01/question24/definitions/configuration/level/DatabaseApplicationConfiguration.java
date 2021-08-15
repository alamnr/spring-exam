package com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.writer.DatabaseStoreFinancialReportWriter;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.writer.FinancialReportWriter;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.dao.DatabaseStoreFinancialDataDao;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.dao.FinancialDataDao;

@Configuration
@Profile("database")
public class DatabaseApplicationConfiguration {
	
	@Bean
	public FinancialDataDao databaseStorefinancialDataDao() {
		return new DatabaseStoreFinancialDataDao();
	}
	
	@Bean
	public FinancialReportWriter databaseStoreFinancialReportWriter() {
		return new DatabaseStoreFinancialReportWriter();
	}

}
