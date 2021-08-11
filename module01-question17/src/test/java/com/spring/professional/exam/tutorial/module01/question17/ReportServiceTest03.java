package com.spring.professional.exam.tutorial.module01.question17;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.any;

import org.junit.Before;
import org.junit.Test;

import org.springframework.test.util.ReflectionTestUtils;

import com.spring.professional.exam.tutorial.module01.question17.ds.Report;
import com.spring.professional.exam.tutorial.module01.question17.service.ReportService;
import com.spring.professional.exam.tutorial.module01.question17.writer.ReportWriter;

public class ReportServiceTest03 {
	
	private ReportService reportService;
	
	@Before
	public void setUp() {
		reportService = new ReportService();
	}
	
	@Test
	public void shouldPassReportToWrite() {
		ReportWriter  reportWriter = mock(ReportWriter.class);
		
		ReflectionTestUtils.setField(reportService,ReportService.class,"reportWriter", reportWriter, ReportWriter.class);
		
		reportService.execute();
		
		verify(reportWriter).write(any(Report.class), (String) any());
	}

}
