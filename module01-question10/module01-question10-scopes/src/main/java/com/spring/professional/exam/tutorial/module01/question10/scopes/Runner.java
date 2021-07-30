package com.spring.professional.exam.tutorial.module01.question10.scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.professional.exam.tutorial.module01.question10.scopes.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question10.scopes.beans.SpringBean2;

/**
 * Hello world!
 *
 */
public class Runner 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();
        
        
        
        System.out.println("Spring Bean1-"+context.getBean(SpringBean1.class));
        System.out.println("Spring Bean1-"+context.getBean(SpringBean1.class));
        
        System.out.println("Spring Bean2-"+context.getBean(SpringBean2.class));
        System.out.println("Spring Bean2-"+context.getBean(SpringBean2.class));
    }
}
