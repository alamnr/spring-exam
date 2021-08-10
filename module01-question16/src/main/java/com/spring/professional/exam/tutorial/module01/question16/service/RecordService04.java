package com.spring.professional.exam.tutorial.module01.question16.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.validation.ValidationUtils;

import com.spring.professional.exam.tutorial.module01.question16.non.beans.RecordsValidator;
import com.spring.professional.exam.tutorial.module01.question16.reader.DbRecordsReader;

@Service
public class RecordService04 {
	
	@Autowired
	public void setRecordReader(DbRecordsReader dbRecordsReader) {
		System.out.println(getClass().getSimpleName()+"   setRecordReader \n"
				+" dbRecordsReader = " + dbRecordsReader );
	}
	
	@Autowired
	//public void setRecordReaderAndValidator(DbRecordsReader dbRecordsReader,  Optional<RecordsValidator> recordsValidator) {
	//public void setRecordReaderAndValidator(DbRecordsReader dbRecordsReader, @Nullable RecordsValidator recordsValidator) {
	public void setRecordReaderAndValidator(DbRecordsReader dbRecordsReader, @Autowired(required = false) RecordsValidator recordsValidator) {
	//@Autowired(required = false)				
	//public void setRecordReaderAndValidator(DbRecordsReader dbRecordsReader, RecordsValidator recordsValidator) {
		System.out.println(getClass().getSimpleName() + "    setRecordReaderAndValidator \n" + 
				" dbRecordsReader = " + dbRecordsReader+"\n"+
			
				 " recordsValidator = "+ recordsValidator
				
				);
		
		
	}

}
