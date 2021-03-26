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

@XmlType(name = "IcmsOO", propOrder = { "xmlnsNfe", "orig", "cst", "modBc", "vBc", "pIcms", "vIcms" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IcmsOODTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlElement(name = "orig", namespace = xmlnsNfe)
	private String orig;

	@NotBlank
	@XmlElement(name = "CST", namespace = xmlnsNfe)
	private String cst;

	@NotBlank
	@XmlElement(name = "modBC", namespace = xmlnsNfe)
	private String modBc;
	
	@NotNull
	@XmlElement(name = "vBC", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal vBc;

	@NotNull
	@XmlElement(name = "pICMS", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal pIcms;

	@NotNull
	@XmlElement(name = "vICMS", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal vIcms;

}
