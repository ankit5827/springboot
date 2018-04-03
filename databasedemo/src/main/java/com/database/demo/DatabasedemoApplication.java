package com.database.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={
		"com.database.demo.*"})
@ComponentScan(basePackageClasses= {com.databse.demo.service.CustomerService.class})

public class DatabasedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabasedemoApplication.class, args);
	}
}
