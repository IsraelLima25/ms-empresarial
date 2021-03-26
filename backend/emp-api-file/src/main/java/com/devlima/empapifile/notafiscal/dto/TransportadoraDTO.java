package com.devlima.empapifile.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.br.CNPJ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "transp")
@XmlType(name = "Transportadora", propOrder = { "xmlnsNfe", "cnpj", "nome", "ie", "ender", "municipio", "uf" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransportadoraDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@CNPJ
	@XmlElement(name = "CNPJ", namespace = xmlnsNfe)
	private String cnpj;
	
	@NotBlank
	@XmlElement(name = "xNome", namespace = xmlnsNfe)
	private String nome;

	@NotBlank
	@XmlElement(name = "IE", namespace = xmlnsNfe)
	private String ie;

	@NotBlank
	@XmlElement(name = "xEnder", namespace = xmlnsNfe)
	private String ender;

	@NotBlank
	@XmlElement(name = "xMun", namespace = xmlnsNfe)
	private String municipio;

	@NotBlank
	@XmlElement(name = "UF", namespace = xmlnsNfe)
	private String uf;

}
