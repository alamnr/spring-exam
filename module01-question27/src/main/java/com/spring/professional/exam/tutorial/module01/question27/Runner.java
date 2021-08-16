package com.spring.professional.exam.tutorial.module01.question27;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question27.beans.SpringBean;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		
		// Activate Profile
		generateProfiles(10000000).forEach(
				p -> context.getEnvironment().addActiveProfile(p)
			);
		context.register(ApplicationConfiguration.class);
		context.refresh();
		
		System.out.println("Number of Profiles = "+ context.getEnvironment().getActiveProfiles().length);
		System.out.println("Bean on Profile-9999999 = " + context.getBean(SpringBean.class).getClass().getSimpleName());
		
		
	}
	
	private static List<String> generateProfiles(int numberOfProfiles){
		return IntStream.range(0, numberOfProfiles)
				.mapToObj(i->String.format("Profile-%d", i))
				.collect(Collectors.toList());
	}
}
