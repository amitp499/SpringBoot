package com.jpm.hr.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jpm.hr.services, com.jpm.hr.controller,  com.jpm.hr.daos")
@EntityScan("com.jpm.hr.entity")
public class StartAppl {

	public static void main(String[] args) {
		SpringApplication.run(StartAppl.class, args);
	}
}
