package com.spring.professional.exam.tutorial.module01.question17;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.any;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.professional.exam.tutorial.module01.question17.ds.Report;
import com.spring.professional.exam.tutorial.module01.question17.service.ReportService;
import com.spring.professional.exam.tutorial.module01.question17.writer.DbReportWriter;
import com.spring.professional.exam.tutorial.module01.question17.writer.ReportWriter;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class ReportServiceTest01 {
	
	@Autowired
	private ReportService reportService;
		
	@MockBean
	private ReportWriter reportWriter;
	
	@Test
	public void shouldPassReportToWriter() {
		reportService.execute();
		
		verify(reportWriter).write(any(Report.class), anyString());
	}
	

}
 