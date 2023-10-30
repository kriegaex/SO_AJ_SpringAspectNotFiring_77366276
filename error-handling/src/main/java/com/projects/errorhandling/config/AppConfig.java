package com.projects.errorhandling.config;


import com.projects.errorhandling.aspect.ErrorAspect;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@Slf4j
public class AppConfig {
    @Bean
    public ErrorAspect centralizedExceptionHandlerAspect() {
        log.debug("ExceptionHandlerAspect created");
        System.out.println("ExceptionHandlerAspect created");
        return new ErrorAspect();
    }
}
