package com.spring.professional.exam.tutorial.module01.question18.writer;

import java.util.Collection;

import org.springframework.stereotype.Component;

@Component("db-writer")
public class DbRecordWriter implements RecordsWriter {

	@Override
	public void writeRecords(Collection<Record> records) {
		System.out.println("DB record writer");
		
	}

}
