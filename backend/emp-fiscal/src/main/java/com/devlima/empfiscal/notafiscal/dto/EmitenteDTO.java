package com.devlima.empfiscal.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmitenteDTO {

	@CNPJ
	private String cnpj;

	@CPF
	private String cpf;

	@NotBlank
	private String razaoSocial;

	@NotBlank
	private String nomeFantasia;

	@NotNull
	private EnderecoDTO endereco;

	@NotBlank
	private String ie;

	@NotBlank
	private String iest;

	@NotBlank
	private String crt;

}
