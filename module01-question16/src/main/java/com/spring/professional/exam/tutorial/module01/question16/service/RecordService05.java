package com.spring.professional.exam.tutorial.module01.question16.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.professional.exam.tutorial.module01.question16.reader.RecordReader;

@Service
public class RecordService05 {

	@Autowired
	public void setRecordReaders(List<RecordReader> recordReaders) {
		System.out.println(getClass().getSimpleName()+" setRecordReaders: ");
		recordReaders.stream().map(r->"\t" + r.getClass().getSimpleName())
								.forEach(System.out::println);
	}
}
