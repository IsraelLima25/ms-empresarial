package com.devlima.empapifile.notafiscal.unmarshall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "protNFe", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlType(name = "ProtNfe", propOrder = { "xmlnsNfe", "versao", "infProt" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProtNfe {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlAttribute(name = "versao")
	private String versao;

	@XmlElement(name = "infProt", namespace = xmlnsNfe)
	private InfProt infProt;

}
