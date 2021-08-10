package com.spring.professional.exam.tutorial.module01.question16.service;

import java.util.Optional;

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
public class RecordService02 {
	
	
	  public final DbRecordsReader dbRecordsReader;
	  
	  protected final DbRecordsBackup dbRecordsBackup;
	  
	  private final DbRecordsProcessor dbRecordsProcessor;
	  
	  final DbRecordsWriter dbRecordsWriter;
	  
	  private final Optional<RecordsHash> recordsHash;
	  
	  private final RecordsUtil recordsUtil;
	  
	  private final RecordsValidator recordsValidator;
	 
	
	public RecordService02(DbRecordsReader dbRecordsReader,DbRecordsBackup dbRecordsBackup,
			DbRecordsProcessor dbRecordsProcessor,DbRecordsWriter dbRecordsWriter,Optional<RecordsHash> recordsHash,
			@Nullable RecordsUtil recordsUtil,@Autowired(required = false) RecordsValidator recordsValidator) {
		
		this.dbRecordsBackup = dbRecordsBackup;
		this.dbRecordsProcessor = dbRecordsProcessor;
		this.dbRecordsReader = dbRecordsReader;
		this.dbRecordsWriter = dbRecordsWriter;
		this.recordsHash = recordsHash;
		this.recordsUtil = recordsUtil;
		this.recordsValidator = recordsValidator;
		
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
