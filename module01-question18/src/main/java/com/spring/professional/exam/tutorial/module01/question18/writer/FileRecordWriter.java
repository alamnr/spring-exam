package com.spring.professional.exam.tutorial.module01.question18.writer;

import java.util.Collection;

import org.springframework.stereotype.Component;

@Component("file-writer")
public class FileRecordWriter implements RecordsWriter {

	@Override
	public void writeRecords(Collection<Record> records) {
		System.out.println("File record writer");
		
	}

}
