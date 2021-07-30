package com.spring.professional.exam.tutorial.module01.question10.stereotypes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.professional.exam.tutorial.module01.question10.stereotypes.ds.Article;
import com.spring.professional.exam.tutorial.module01.question10.stereotypes.ds.TaxInformation;
import com.spring.professional.exam.tutorial.module01.question10.stereotypes.service.TaxInformationService;

@Controller
public class TaxInformationController {
	@Autowired
	private TaxInformationService taxInformationService;
	
	public void printTaxInformation(Article article) {
		TaxInformation taxInformation = taxInformationService.getTaxinInformation(article);
		String  formattedTaxInformation = String.format(" %s %s ", taxInformation.getArticle().getName(),taxInformation.getTaxCalculation().getTaxValue());
		
		System.out.println(formattedTaxInformation);
	}	

}
