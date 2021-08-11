package com.spring.professional.exam.tutorial.module01.question17.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.spring.professional.exam.tutorial.module01.question17.ds.Report;
import com.spring.professional.exam.tutorial.module01.question17.writer.ReportWriter;

@Service
public class ReportService {
	
	@Autowired
	private ReportWriter reportWriter;
	
	@Value("${report.global.name}")
	private String reportGlobalName;

	public void  execute() {
		Report report = new Report();		
		reportWriter.write(report, reportGlobalName);
	}
}
