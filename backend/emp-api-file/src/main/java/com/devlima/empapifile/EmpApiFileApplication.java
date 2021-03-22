package com.devlima.empapifile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EmpApiFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpApiFileApplication.class, args);
	}

}
