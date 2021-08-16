package com.spring.professional.exam.tutorial.module01.question29;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question29.bean.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question29.bean.SpringBean2;

public class Runner 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerShutdownHook();
        context.register(ApplicationConfig.class);
        context.refresh();
        
        System.out.println(context.getBean(SpringBean1.class).toString());
        System.out.println(context.getBean(SpringBean2.class).toString());
        
    }
}
