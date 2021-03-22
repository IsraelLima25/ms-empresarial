package com.devlima.empapifile.notafiscal.unmarshall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlType(name = "Imposto", propOrder = { "xmlnsNfe", "icms", "pis", "cofins", "icmsUfDest" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Imposto {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "ICMS", namespace = xmlnsNfe)
	private Icms icms;

	@XmlElement(name = "PIS", namespace = xmlnsNfe)
	private Pis pis;

	@XmlElement(name = "COFINS", namespace = xmlnsNfe)
	private Cofins cofins;

	@XmlElement(name = "ICMSUFDest", namespace = xmlnsNfe)
	private IcmsUfDest icmsUfDest;

}
