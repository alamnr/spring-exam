package com.spring.professional.exam.tutorial.module01.question15.advance;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
		basePackages = "com.spring.professional.exam.tutorial.module01.question15.advance.beans",
		includeFilters = @ComponentScan.Filter(type = FilterType.REGEX,pattern = ".*Bean"),
		excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*(Controller|Service).*")		
		)
public class ApplicationConfiguration {

	

}
