package com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.service.FinancialReportService;
import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.dao.DatabaseStorefinancialDataDao;
import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.dao.FilestoreFinancialDataDao;
import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.dao.FinancialDataDao;
import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.writer.DatabaseStoreFinancialReportWriter;
import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.writer.FileStoreFinancialReportWriter;
import com.spring.professional.exam.tutorial.module01.question24.definitions.bean.method.level.writer.FinancialReportWriter;

@Configuration
public class ApplicationConfig {
	
	@Bean
	
	public FinancialReportService  financialReportService(FinancialDataDao financialDataDao,
			FinancialReportWriter financialReportWriter) {
		return new FinancialReportService(financialDataDao, financialReportWriter);
	}
	
	@Bean
	@Profile("database")
	public FinancialDataDao databaseStorefinancialDataDao() {
		return new DatabaseStorefinancialDataDao();
	}
	
	@Bean
	@Profile("database")
	public FinancialReportWriter databaseStoreFinancialReportWriter() {
		return new DatabaseStoreFinancialReportWriter();
	}
	
	@Bean
	@Profile("file")
	public FinancialDataDao filestoreFinancialDataDao() {
		return new FilestoreFinancialDataDao();
	}
		
	@Bean
	@Profile("file")
	public FinancialReportWriter fileStoreFinancialReportWriter() {
		return new FileStoreFinancialReportWriter();
	}

}
