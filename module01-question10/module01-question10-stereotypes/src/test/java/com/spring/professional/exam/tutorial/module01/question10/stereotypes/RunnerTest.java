package com.spring.professional.exam.tutorial.module01.question10.stereotypes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.professional.exam.tutorial.module01.question10.stereotypes.controller.TaxInformationController;
import com.spring.professional.exam.tutorial.module01.question10.stereotypes.ds.Article;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class RunnerTest 
{
    @Autowired
	private TaxInformationController taxInformationController;
    @Test
    public void calculateTax()
    {
    	taxInformationController.printTaxInformation(new Article(5));
        assertTrue( true );
    }
}
