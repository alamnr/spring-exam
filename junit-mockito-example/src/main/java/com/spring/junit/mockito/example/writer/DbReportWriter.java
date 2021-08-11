package com.spring.junit.mockito.example.writer;

import org.springframework.stereotype.Component;

import com.spring.junit.mockito.example.ds.Report;

@Component
public class DbReportWriter implements ReportWriter {

	@Override
	public void writeReport(Report report, String reportName) {
		System.out.println("writing DB report");
		
	}

}
