package com.spring.junit.mockito.example.service;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.any;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.junit.mockito.example.ApplicationConfiguration;
import com.spring.junit.mockito.example.ds.Report;
import com.spring.junit.mockito.example.writer.ReportWriter;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class ReportServiceTest01 {
	
	@Autowired
	private ReportService reportService;
	
	@MockBean
	private ReportWriter reportWriter;
	
	@Test
	public void shouldPassWriteReport() {
		reportService.write();
		verify(reportWriter).writeReport(any(Report.class), (String) any());
	}

}
