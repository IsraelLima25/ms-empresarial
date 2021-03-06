package com.devlima.empapifile.notafiscal.dto;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlType(name = "Pis", propOrder = { "xmlnsNfe", "pisAliq" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PisDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotNull
	@XmlElement(name = "PISAliq", namespace = xmlnsNfe)
	private PisAliqDTO pisAliq;

}
