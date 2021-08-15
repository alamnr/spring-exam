package com.spring.professional.exam.tutorial.module01.question25;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.professional.exam.tutorial.module01.question25.beans.DataMapper;
import com.spring.professional.exam.tutorial.module01.question25.beans.DataProcessor;
import com.spring.professional.exam.tutorial.module01.question25.beans.DataReader;
import com.spring.professional.exam.tutorial.module01.question25.beans.DataWriter;
import com.spring.professional.exam.tutorial.module01.question25.beans.DbDataReader;
import com.spring.professional.exam.tutorial.module01.question25.beans.DevDataWriter;
import com.spring.professional.exam.tutorial.module01.question25.beans.FileDataReader;
import com.spring.professional.exam.tutorial.module01.question25.beans.MultiSourceDataProcessor;
import com.spring.professional.exam.tutorial.module01.question25.beans.ProdDataWriter;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public DataMapper dataMapper() {
		return new DataMapper();
	}
	
	@Bean
	@Profile({"database","file"})
	public DataProcessor multiSourceDataProcessor() {
		return new MultiSourceDataProcessor();
	}
	
	@Bean
	@Profile("database")
	public DataReader dbDataReader() {
		return new DbDataReader();
	}
	
	@Bean
	@Profile("file")
	public DataReader fileDataReader() {
		return new FileDataReader();
	}
	
	@Bean
	@Profile("!prod")
	public DataWriter devDataWriter() {
		return new DevDataWriter();
	}
		
	@Bean
	@Profile("!dev")
	public DataWriter prodDataWriter() {
		return new ProdDataWriter();
	}

}
