package com.spring.professional.exam.tutorial.module01.question10.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import com.spring.professional.exam.tutorial.module01.question10.annotations.beans.SpringBean1;

@ComponentScan(
		basePackages = "com.spring.professional.exam.tutorial.module01.question05.annotations.beans",
		/*basePackageClasses = SpringBean1.class,*/
		includeFilters = @ComponentScan.Filter(type = FilterType.REGEX,pattern = ".*Bean.*"),
		excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Bean1.*")
		)
public class ApplicationConfigurationAdvance {

}
