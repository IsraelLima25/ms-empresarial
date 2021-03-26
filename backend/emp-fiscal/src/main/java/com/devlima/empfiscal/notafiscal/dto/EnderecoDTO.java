package com.devlima.empfiscal.notafiscal.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {
	
	@NotBlank
	private String logradouro;
	
	@NotBlank	
	private String numero;
	
	@NotBlank
	private String complemento;
	
	@NotBlank
	private String bairro;
	
	@NotBlank
	private String codigoMunicipio;
	
	@NotBlank
	private String municipio;
	
	@NotBlank
	private String uf;
	
	@NotBlank
	private String cep;
	
	@NotBlank
	private String codigoPais;
	
	@NotBlank
	private String pais;
	
	@NotBlank
	private String telefone;

}
