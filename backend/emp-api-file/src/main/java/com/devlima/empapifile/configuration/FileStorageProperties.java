package com.devlima.empapifile.configuration;

import javax.validation.constraints.NotBlank;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@ConfigurationProperties(prefix = "file")
@Data
@NoArgsConstructor
public class FileStorageProperties {
	
	@NotBlank
	private String uploadDir;
}
