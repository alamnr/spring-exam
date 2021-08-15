package com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.dao.FinancialDataDao;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.writer.FileStoreFinancialReportWriter;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.writer.FinancialReportWriter;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.dao.FilestoreFinancialDataDao;

@Configuration
@Profile("file")
public class FileStoreApplicationConfiguration {

	@Bean
	public FinancialDataDao filestoreFinancialDataDao() {
		return new FilestoreFinancialDataDao();
	}
	
	@Bean
	public FinancialReportWriter fileStoreFinancialReportWriter() {
		return new FileStoreFinancialReportWriter();
	}
}
