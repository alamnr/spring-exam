package com.spring.professional.exam.tutorial.module01.question23;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question23.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question23.beans.SpringBean2;


public class Runner 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();
        
        context.getBean(SpringBean1.class);
        context.getBean(SpringBean1.class);
        context.getBean(SpringBean1.class);
        
        
        context.getBean(SpringBean2.class);
        context.getBean(SpringBean2.class);
        context.getBean(SpringBean2.class);
    }
}
