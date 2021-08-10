package com.spring.professional.exam.tutorial.module01.question16.reader;

import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;


@Component
public class DbRecordsReader implements RecordReader {

	@Override
	public Collection<Record> readRecord() {
		
		return Collections.emptyList();
	}

}
