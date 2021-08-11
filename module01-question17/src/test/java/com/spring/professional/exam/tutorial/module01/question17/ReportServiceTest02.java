package com.spring.professional.exam.tutorial.module01.question17;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;

import com.spring.professional.exam.tutorial.module01.question17.ds.Report;
import com.spring.professional.exam.tutorial.module01.question17.service.ReportService;
import com.spring.professional.exam.tutorial.module01.question17.writer.ReportWriter;

@RunWith(MockitoJUnitRunner.class)
public class ReportServiceTest02 {
	
	@InjectMocks
	private ReportService reportService;
	
	//private ReportWriter reportWriter = mock(ReportWriter.class);
	@Mock
	private ReportWriter reportWriter;
	
	@Test
	public void shouldPassReportToWwrite() {
		reportService.execute();
		
		verify(reportWriter).write(any(Report.class), (String) any());
	}

}
