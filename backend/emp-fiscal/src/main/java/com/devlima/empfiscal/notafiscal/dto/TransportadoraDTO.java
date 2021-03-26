package com.devlima.empfiscal.notafiscal.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransportadoraDTO {

	@NotBlank
	private String cnpj;

	@NotBlank
	private String nome;

	@NotBlank
	private String ie;

	@NotBlank
	private String ender;

	@NotBlank
	private String municipio;

	@NotBlank
	private String uf;

}
