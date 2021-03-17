package com.devlima.empfiscal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EmpFiscalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpFiscalApplication.class, args);
	}

}
