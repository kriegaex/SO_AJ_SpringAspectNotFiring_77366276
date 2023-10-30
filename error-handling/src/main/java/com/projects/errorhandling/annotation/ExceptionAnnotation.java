package com.projects.errorhandling.annotation;

import com.projects.errorhandling.config.AppConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Import(AppConfig.class)
public @interface ExceptionAnnotation {
    // ACTIVATES THE CONFIGURATION CLASS
}
