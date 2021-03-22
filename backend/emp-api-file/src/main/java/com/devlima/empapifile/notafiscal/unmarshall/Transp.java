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
@XmlType(name = "Transp", propOrder = { "xmlnsNfe", "modFrete", "transportadora", "volume" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transp {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "modFrete", namespace = xmlnsNfe)
	private String modFrete;

	@XmlElement(name = "transporta", namespace = xmlnsNfe)
	private Transportadora transportadora;

	@XmlElement(name = "vol", namespace = xmlnsNfe)
	private Volume volume;

}
