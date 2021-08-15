package com.spring.professional.exam.tutorial.module01.question24.definitions.custom.annotation.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Profile;

@Profile("file")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FileProfile {

}
