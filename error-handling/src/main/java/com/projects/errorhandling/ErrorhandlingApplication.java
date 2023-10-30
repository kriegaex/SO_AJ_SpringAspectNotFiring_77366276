package com.projects.errorhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.projects.errorhandling.config", "com.projects.errorhandling"})

public class ErrorhandlingApplication {
	public static void main(String[] args) {
		SpringApplication.run(ErrorhandlingApplication.class, args);
	}
}
