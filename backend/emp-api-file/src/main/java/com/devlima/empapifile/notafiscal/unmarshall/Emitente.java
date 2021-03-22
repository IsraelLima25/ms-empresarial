package com.devlima.empapifile.notafiscal.unmarshall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
public class Emitente {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "CNPJ", namespace = xmlnsNfe)
	private String cnpj;

	@XmlElement(name = "CPF", namespace = xmlnsNfe)
	private String cpf;

	@XmlElement(name = "xNome", namespace = xmlnsNfe)
	private String razaoSocial;

	@XmlElement(name = "xFant", namespace = xmlnsNfe)
	private String nomeFantasia;

	@XmlElement(name = "enderEmit", namespace = xmlnsNfe)
	private Endereco endereco;

	@XmlElement(name = "ie", namespace = xmlnsNfe)
	private String ie;

	@XmlElement(name = "IEST", namespace = xmlnsNfe)
	private String iest;

	@XmlElement(name = "CRT", namespace = xmlnsNfe)
	private String crt;

}
