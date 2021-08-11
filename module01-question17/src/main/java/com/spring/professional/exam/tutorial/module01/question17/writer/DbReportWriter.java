package com.spring.professional.exam.tutorial.module01.question17.writer;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question17.ds.Report;

@Component
public class DbReportWriter implements ReportWriter {

	@Override
	public void write(Report report, String reportName) {
		System.out.println(" Writing report ");
		
	}

}
