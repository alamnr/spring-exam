package com.spring.junit.mockito.example.service;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.any;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.spring.junit.mockito.example.ds.Report;
import com.spring.junit.mockito.example.writer.ReportWriter;

@RunWith(MockitoJUnitRunner.class)
public class ReportServiceTest02 {
	@InjectMocks
	private ReportService reportService;
	
	@Mock
	ReportWriter reportWriter;
	
	@Test
	public void shouldPassWriteReport() {
		reportService.write();
		verify(reportWriter).writeReport(any(Report.class), (String) any());
		
	}

}
