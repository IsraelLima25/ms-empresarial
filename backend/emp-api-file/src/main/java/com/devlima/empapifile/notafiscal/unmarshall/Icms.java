package com.devlima.empapifile.notafiscal.unmarshall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlType(name = "Icms", propOrder = { "xmlnsNfe", "icmsOO" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Icms {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "ICMS00", namespace = xmlnsNfe)
	private IcmsOO icmsOO;
}
