package com.example.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.bankapp", "com.projects.errorhandling"})
@EnableAspectJAutoProxy
public class BankAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankAppApplication.class, args);
	}

}
