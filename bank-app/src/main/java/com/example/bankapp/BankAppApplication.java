package com.example.bankapp;

import com.example.bankapp.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.bankapp", "com.projects.errorhandling"})
@EnableAspectJAutoProxy
public class BankAppApplication {

	public static void main(String[] args) {

		try (ConfigurableApplicationContext context = SpringApplication.run(BankAppApplication.class, args)) {
			context.getBean(AccountService.class).getAccountById("1");
		}
	}

}
