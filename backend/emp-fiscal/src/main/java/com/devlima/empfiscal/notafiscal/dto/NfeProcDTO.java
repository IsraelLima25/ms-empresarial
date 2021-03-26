package com.devlima.empfiscal.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NfeProcDTO {
	
	@NotNull
	private NfeDTO nfe;
	
	@NotNull
	private ProtNfeDTO protNfe;
	
	@NotBlank
	private String versao;

}
