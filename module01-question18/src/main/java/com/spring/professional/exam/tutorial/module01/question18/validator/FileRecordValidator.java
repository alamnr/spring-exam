package com.spring.professional.exam.tutorial.module01.question18.validator;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.spring.professional.exam.tutorial.module01.question18.validator.RecordsValidatorType.RecordsValidatorMode;

@Component
@RecordsValidatorType(RecordsValidatorMode.DB)
public class FileRecordValidator implements RecordsValidator {

	@Override
	public void validate(Collection<Record> records) {
		System.out.println("File Record Validator");
		
	}

}
