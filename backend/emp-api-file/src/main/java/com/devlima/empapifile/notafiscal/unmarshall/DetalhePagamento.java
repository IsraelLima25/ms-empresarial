package com.devlima.empapifile.notafiscal.unmarshall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "detPag")
@XmlType(name = "DetalhePagamento", propOrder = { "xmlnsNfe", "indPag", "tPag", "vPag" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalhePagamento {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "indPag", namespace = xmlnsNfe)
	private String indPag;

	@XmlElement(name = "tPag", namespace = xmlnsNfe)
	private String tPag;

	@XmlElement(name = "vPag", namespace = xmlnsNfe)
	private String vPag;

}
