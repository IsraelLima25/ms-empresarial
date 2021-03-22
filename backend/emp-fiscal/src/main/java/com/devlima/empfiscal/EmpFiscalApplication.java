package com.devlima.empfiscal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.devlima.empfiscal.configuration.FilesStorageProperties;

@EnableEurekaClient
@SpringBootApplication
@EnableConfigurationProperties({
	FilesStorageProperties.class
})
@EnableFeignClients
public class EmpFiscalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpFiscalApplication.class, args);
	}
}
