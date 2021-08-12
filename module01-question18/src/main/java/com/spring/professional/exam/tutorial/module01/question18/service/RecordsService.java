package com.spring.professional.exam.tutorial.module01.question18.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.professional.exam.tutorial.module01.question18.bls.RecordProcessor;
import com.spring.professional.exam.tutorial.module01.question18.reader.RecordsReader;
import com.spring.professional.exam.tutorial.module01.question18.validator.RecordsValidator;
import com.spring.professional.exam.tutorial.module01.question18.validator.RecordsValidatorType;
import com.spring.professional.exam.tutorial.module01.question18.validator.RecordsValidatorType.RecordsValidatorMode;
import com.spring.professional.exam.tutorial.module01.question18.writer.RecordsWriter;

@Service
public class RecordsService {
	
	@Autowired
	@Qualifier("dbRecordProcessor")
	private RecordProcessor recordProcessor;
	
	@Autowired
	@Qualifier("file-records-reader")
	private RecordsReader recordsReader;
	
	@Autowired
	@Qualifier("db-writer")
	private RecordsWriter recordsWriter;
	
	@Autowired
	@RecordsValidatorType(RecordsValidatorMode.FILE)
	private RecordsValidator recordsValidator;
	

}
