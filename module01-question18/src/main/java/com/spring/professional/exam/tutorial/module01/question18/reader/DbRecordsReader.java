package com.spring.professional.exam.tutorial.module01.question18.reader;

import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

@Component("db-records-reader")
public class DbRecordsReader implements RecordsReader {

	@Override
	public Collection<Record> readRecord() {
		System.out.println("Db records reader");
		return Collections.emptyList();
	}

}
