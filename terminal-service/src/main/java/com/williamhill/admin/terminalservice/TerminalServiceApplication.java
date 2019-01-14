package com.williamhill.admin.terminalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class TerminalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerminalServiceApplication.class, args);
	}

}

