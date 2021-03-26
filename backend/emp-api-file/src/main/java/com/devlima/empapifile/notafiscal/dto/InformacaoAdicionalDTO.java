package com.devlima.empapifile.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "infAdic")
@XmlType(name = "InformacaoAdicional", propOrder = { "xmlnsNfe", "informacaoComplementar" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformacaoAdicionalDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlElement(name = "infCpl", namespace = xmlnsNfe)
	private String informacaoComplementar;

}
