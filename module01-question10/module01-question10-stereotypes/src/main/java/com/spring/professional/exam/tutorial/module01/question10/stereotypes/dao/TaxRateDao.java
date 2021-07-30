package com.spring.professional.exam.tutorial.module01.question10.stereotypes.dao;

import org.springframework.stereotype.Repository;

import com.spring.professional.exam.tutorial.module01.question10.stereotypes.ds.Article;
import com.spring.professional.exam.tutorial.module01.question10.stereotypes.ds.TaxRate;

@Repository
public class TaxRateDao {
	public TaxRate getTaxRate(Article article) {
		return new TaxRate();
	}
}
