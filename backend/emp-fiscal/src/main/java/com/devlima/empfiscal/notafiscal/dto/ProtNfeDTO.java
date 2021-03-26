package com.devlima.empfiscal.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProtNfeDTO {
	
	@NotBlank
	private String versao;
	
	@NotNull
	private InfProtDTO infProt;

}
