package com.devlima.empapifile.notafiscal.dto;

import javax.validation.constraints.NotNull;
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
public class ImpostoDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@NotNull
	@XmlElement(name = "ICMS", namespace = xmlnsNfe)
	private IcmsDTO icms;

	@NotNull
	@XmlElement(name = "PIS", namespace = xmlnsNfe)
	private PisDTO pis;

	@NotNull
	@XmlElement(name = "COFINS", namespace = xmlnsNfe)
	private CofinsDTO cofins;

	@NotNull
	@XmlElement(name = "ICMSUFDest", namespace = xmlnsNfe)
	private IcmsUfDestDTO icmsUfDest;

}
