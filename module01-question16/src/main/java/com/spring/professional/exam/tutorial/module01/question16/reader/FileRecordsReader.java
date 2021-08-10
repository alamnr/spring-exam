package com.spring.professional.exam.tutorial.module01.question16.reader;

import java.util.Collection;
import java.util.Collections;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class FileRecordsReader implements RecordReader {

	@Override
	public Collection<Record> readRecord() {
		
		return null;
	}

}
