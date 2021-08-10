package com.spring.professional.exam.tutorial.module01.question16.service;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import com.spring.professional.exam.tutorial.module01.question16.backup.DbRecordsBackup;
import com.spring.professional.exam.tutorial.module01.question16.non.beans.DbRecordsProcessor;
import com.spring.professional.exam.tutorial.module01.question16.non.beans.RecordsHash;
import com.spring.professional.exam.tutorial.module01.question16.non.beans.RecordsUtil;
import com.spring.professional.exam.tutorial.module01.question16.non.beans.RecordsValidator;
import com.spring.professional.exam.tutorial.module01.question16.reader.DbRecordsReader;
import com.spring.professional.exam.tutorial.module01.question16.writer.DbRecordsWriter;

@Service
public class RecordService01 {
	
	@Autowired
	public DbRecordsReader dbRecordsReader;
	@Autowired	
	protected DbRecordsBackup dbRecordsBackup;
	@Autowired	
	private DbRecordsProcessor dbRecordsProcessor;
	@Autowired
	DbRecordsWriter dbRecordsWriter;
	@Autowired
	private Optional<RecordsHash> recordsHash;
	@Autowired
	@Nullable
	private RecordsUtil recordsUtil;
	@Autowired(required = false)
	private RecordsValidator recordsValidator;
	
	public RecordService01() {
		System.out.println(
				getClass().getSimpleName() + " recordsReader = " + dbRecordsReader +"\n" +
				getClass().getSimpleName() + " recordsBackup = " + dbRecordsBackup + " \n " +
				getClass().getSimpleName() + " recordProcessor = " + dbRecordsProcessor + " \n " +
				getClass().getSimpleName() + " recordWriter = " + dbRecordsWriter + "\n" +
				getClass().getSimpleName() + " recordsHash = " + recordsHash + "\n " +
				getClass().getSimpleName() + " recordsUtil = " + recordsUtil + " \n" +
				getClass().getSimpleName() + " recordsValidor = " + recordsValidator +"\n"
				
		);
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println(
				getClass().getSimpleName() + " recordsReader = " + dbRecordsReader +"\n" +
				getClass().getSimpleName() + " recordsBackup = " + dbRecordsBackup + " \n " +
				getClass().getSimpleName() + " recordProcessor = " + dbRecordsProcessor + " \n " +
				getClass().getSimpleName() + " recordWriter = " + dbRecordsWriter + "\n" +
				getClass().getSimpleName() + " recordsHash = " + recordsHash + "\n " +
				getClass().getSimpleName() + " recordsUtil = " + recordsUtil + " \n" +
				getClass().getSimpleName() + " recordsValidor = " + recordsValidator +"\n"
				
		);
	}

}
