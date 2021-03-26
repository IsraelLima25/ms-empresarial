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

@XmlRootElement(name = "dest")
@XmlType(name = "Destinatario", propOrder = { "xmlnsNfe", "cnpj", "cpf", "nome", "endereco", "indIeDest" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DestinatarioDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@CNPJ
	@XmlElement(name = "CNPJ", namespace = xmlnsNfe)
	private String cnpj;

	@CPF
	@XmlElement(name = "CPF", namespace = xmlnsNfe)
	private String cpf;
	
	@NotBlank
	@XmlElement(name = "xNome", namespace = xmlnsNfe)
	private String nome;
	
	@NotNull
	@XmlElement(name = "enderDest", namespace = xmlnsNfe)
	private EnderecoDTO endereco;
	
	@NotBlank
	@XmlElement(name = "indIEDest", namespace = xmlnsNfe)
	private String indIeDest;

}
