package com.spring.professional.exam.tutorial.module01.question16.reader;

import java.util.Collection;
import java.util.Collections;

import javax.annotation.Priority;

import org.springframework.stereotype.Component;


@Component
@Priority(2)
public class WebServiceRecordsReader implements RecordReader {

	@Override
	public Collection<Record> readRecord() {
		
		return null;
	}

}
