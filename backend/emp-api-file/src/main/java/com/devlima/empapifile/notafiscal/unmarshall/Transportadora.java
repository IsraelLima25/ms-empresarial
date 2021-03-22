package com.devlima.empapifile.notafiscal.unmarshall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "transp")
@XmlType(name = "Transportadora", propOrder = { "xmlnsNfe", "cnpj", "nome", "ie", "ender", "municipio", "uf" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transportadora {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "CNPJ", namespace = xmlnsNfe)
	private String cnpj;

	@XmlElement(name = "xNome", namespace = xmlnsNfe)
	private String nome;

	@XmlElement(name = "IE", namespace = xmlnsNfe)
	private String ie;

	@XmlElement(name = "xEnder", namespace = xmlnsNfe)
	private String ender;

	@XmlElement(name = "xMun", namespace = xmlnsNfe)
	private String municipio;

	@XmlElement(name = "UF", namespace = xmlnsNfe)
	private String uf;

}
