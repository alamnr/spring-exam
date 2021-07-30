package com.spring.professional.exam.tutorial.module01.question10.stereotypes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.professional.exam.tutorial.module01.question10.stereotypes.dao.TaxRateDao;
import com.spring.professional.exam.tutorial.module01.question10.stereotypes.ds.Article;
import com.spring.professional.exam.tutorial.module01.question10.stereotypes.ds.TaxCalculation;
import com.spring.professional.exam.tutorial.module01.question10.stereotypes.ds.TaxInformation;
import com.spring.professional.exam.tutorial.module01.question10.stereotypes.ds.TaxRate;

@Service
public class TaxInformationService {
	
	@Autowired
	private TaxRateDao taxRateDao;
	
	public TaxInformation getTaxinInformation(Article article) {
		TaxRate taxRate = this.taxRateDao.getTaxRate(article);
		return new TaxInformation(article, new TaxCalculation());
	}

}
