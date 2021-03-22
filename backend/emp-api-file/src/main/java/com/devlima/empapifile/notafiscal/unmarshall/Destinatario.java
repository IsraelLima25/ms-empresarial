package com.devlima.empapifile.notafiscal.unmarshall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "dest")
@XmlType(name = "Destinatario", propOrder = { "xmlnsNfe", "cnpj", "cpf", "nome", "endereco", "indIeDest" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Destinatario {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "CNPJ", namespace = xmlnsNfe)
	private String cnpj;

	@XmlElement(name = "CPF", namespace = xmlnsNfe)
	private String cpf;

	@XmlElement(name = "xNome", namespace = xmlnsNfe)
	private String nome;

	@XmlElement(name = "enderDest", namespace = xmlnsNfe)
	private Endereco endereco;

	@XmlElement(name = "indIEDest", namespace = xmlnsNfe)
	private String indIeDest;

}
