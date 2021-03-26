package com.devlima.empapifile.notafiscal.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.devlima.empapifile.adapter.BigDecimalAdapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlType(name = "PisAliq", propOrder = { "xmlnsNfe", "cst", "vBc", "pPis", "vPis" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PisAliqDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlElement(name = "CST", namespace = xmlnsNfe)
	private String cst;

	@NotNull
	@XmlElement(name = "vBC", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal vBc;

	@NotNull
	@XmlElement(name = "pPIS", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal pPis;

	@NotNull
	@XmlElement(name = "vPIS", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal vPis;

}
