package com.spring.professional.exam.tutorial.module01.question18.bls;

import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

@Component("dbRecordProcessor")
public class DbRecordProcessor implements RecordProcessor {

	
	@Override
	public Collection<Record> processRecord(Collection<Record> records) {
		System.out.println("Db record processing");
		return Collections.emptyList();
	}

}
