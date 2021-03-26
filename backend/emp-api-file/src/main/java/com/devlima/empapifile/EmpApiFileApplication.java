package com.devlima.empapifile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.devlima.empapifile.configuration.FileStorageProperties;

@EnableEurekaClient
@EnableConfigurationProperties({
	FileStorageProperties.class
})
@SpringBootApplication
public class EmpApiFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpApiFileApplication.class, args);
	}

}
