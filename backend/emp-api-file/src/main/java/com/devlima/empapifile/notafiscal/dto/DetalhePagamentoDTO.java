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

@XmlRootElement(name = "detPag")
@XmlType(name = "DetalhePagamento", propOrder = { "xmlnsNfe", "indPag", "tPag", "vPag" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalhePagamentoDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlElement(name = "indPag", namespace = xmlnsNfe)
	private String indPag;

	@NotBlank
	@XmlElement(name = "tPag", namespace = xmlnsNfe)
	private String tPag;

	@NotBlank
	@XmlElement(name = "vPag", namespace = xmlnsNfe)
	private String vPag;

}
