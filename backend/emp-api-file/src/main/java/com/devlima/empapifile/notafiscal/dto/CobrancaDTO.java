package com.devlima.empapifile.notafiscal.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "cobr")
@XmlType(name = "Cobranca", propOrder = { "xmlnsNfe", "fatura", "duplicatas" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CobrancaDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotNull
	@XmlElement(name = "fat", namespace = xmlnsNfe)
	private FaturaDTO fatura;
	
	@NotNull
	@XmlElement(name = "dup", namespace = xmlnsNfe)
	private List<DuplicataDTO> duplicatas;

}
