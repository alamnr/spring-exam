package com.spring.professional.exam.tutorial.module01.question18.bls;

import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

@Component("fileRecordProcessor")
public class FileRecordProcessor implements RecordProcessor{

	@Override
	public Collection<Record> processRecord(Collection<Record> records) {
		System.out.println("File record processor");
		return Collections.emptyList();
	}

}
