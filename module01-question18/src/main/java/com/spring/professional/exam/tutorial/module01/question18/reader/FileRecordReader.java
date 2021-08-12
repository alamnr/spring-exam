package com.spring.professional.exam.tutorial.module01.question18.reader;

import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

@Component("file-records-reader")
public class FileRecordReader implements RecordsReader {

	@Override
	public Collection<Record> readRecord() {
		System.out.println("File records reader");
		return Collections.emptyList();
	}

}
