package com.devlima.empapifile.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "emit")
@XmlType(name = "Emitente", propOrder = { "xmlnsNfe", "cnpj", "cpf", "razaoSocial", "nomeFantasia", "endereco", "ie",
		"iest", "crt" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmitenteDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@CNPJ
	@XmlElement(name = "CNPJ", namespace = xmlnsNfe)
	private String cnpj;

	@CPF
	@XmlElement(name = "CPF", namespace = xmlnsNfe)
	private String cpf;

	@NotBlank
	@XmlElement(name = "xNome", namespace = xmlnsNfe)
	private String razaoSocial;
	
	@NotBlank
	@XmlElement(name = "xFant", namespace = xmlnsNfe)
	private String nomeFantasia;
	
	@NotNull
	@XmlElement(name = "enderEmit", namespace = xmlnsNfe)
	private EnderecoDTO endereco;

	@NotBlank
	@XmlElement(name = "ie", namespace = xmlnsNfe)
	private String ie;

	@NotBlank
	@XmlElement(name = "IEST", namespace = xmlnsNfe)
	private String iest;

	@NotBlank
	@XmlElement(name = "CRT", namespace = xmlnsNfe)
	private String crt;

}
