package com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.dao.FinancialDataDao;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.writer.FinancialReportWriter;
import com.spring.professional.exam.tutorial.module01.question24.definitions.configuration.level.service.FinancialReportService;

@Configuration
@Import({DatabaseApplicationConfiguration.class,FileStoreApplicationConfiguration.class})
public class AopplicationConfiguration {

	@Bean
	public FinancialReportService financialReportService(FinancialDataDao financialDataDao,FinancialReportWriter financialReportWriter) {
		return new FinancialReportService(financialDataDao, financialReportWriter);
	}
	
}
