package com.devlima.empfiscal.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@ConfigurationProperties(prefix = "file")
@Data
@NoArgsConstructor
public class FilesStorageProperties {
	
	private String uploadDir;
}
