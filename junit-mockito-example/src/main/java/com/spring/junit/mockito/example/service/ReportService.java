package com.spring.junit.mockito.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.junit.mockito.example.ds.Report;
import com.spring.junit.mockito.example.writer.ReportWriter;

@Component
public class ReportService {
	
	@Autowired
	private ReportWriter reportWriter;
	
	@Value("${report.global.name}")
	private String reportName;
	
	public void write() {
		Report report = new Report();
		reportWriter.writeReport(report, reportName);
	}
}
