package com.spring.junit.mockito.example.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.any;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import com.spring.junit.mockito.example.ds.Report;
import com.spring.junit.mockito.example.writer.ReportWriter;

public class ReportServiceTest03 {
	
	private ReportService reportService;
	@Before
	public void setUp() {
		reportService = new ReportService();
	}
	
	@Test
	public void shouldPassWriteReport() {
		ReportWriter reportWriter = mock(ReportWriter.class);
		
		ReflectionTestUtils.setField(reportService,ReportService.class,"reportWriter",reportWriter,ReportWriter.class);
		
		reportService.write();
		
		verify(reportWriter).writeReport(any(Report.class), (String) any());
	}

}
