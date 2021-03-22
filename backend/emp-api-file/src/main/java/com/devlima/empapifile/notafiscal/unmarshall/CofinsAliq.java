package com.devlima.empapifile.notafiscal.unmarshall;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.devlima.empapifile.adapter.BigDecimalAdapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlType(name = "CofinsAliq", propOrder = { "xmlnsNfe", "cst", "vBc", "pCofins", "vCofins" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CofinsAliq {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "CST", namespace = xmlnsNfe)
	private String cst;

	@XmlElement(name = "vBC", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal vBc;

	@XmlElement(name = "pCOFINS", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal pCofins;

	@XmlElement(name = "vCOFINS", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal vCofins;
}
