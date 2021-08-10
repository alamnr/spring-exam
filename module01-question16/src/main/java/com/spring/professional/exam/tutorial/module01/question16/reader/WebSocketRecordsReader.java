package com.spring.professional.exam.tutorial.module01.question16.reader;

import java.util.Collection;
import java.util.Collections;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;


@Component
public class WebSocketRecordsReader implements RecordReader, Ordered {

	@Override
	public Collection<Record> readRecord() {
		
		return null;
	}

	@Override
	public int getOrder() {
		
		return 3;
	}

}
