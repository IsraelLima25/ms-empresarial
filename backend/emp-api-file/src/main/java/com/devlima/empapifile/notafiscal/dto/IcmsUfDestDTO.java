package com.devlima.empapifile.notafiscal.dto;

import java.math.BigDecimal;

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

@XmlType(name = "IcmsUfDest", propOrder = { "xmlnsNfe", "vbcufDest", "pFcpUfDest", "pIcmsUfDest", "pIcmsInter",
		"pIcmsInterPart", "vFcpUfDest", "cIcmsUfDest", "vIcmsUfRemet" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IcmsUfDestDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotNull
	@XmlElement(name = "vBCUFDest", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal vbcufDest;

	@NotNull
	@XmlElement(name = "pFCPUFDest", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal pFcpUfDest;

	@NotNull
	@XmlElement(name = "pICMSUFDest", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal pIcmsUfDest;

	@NotNull
	@XmlElement(name = "pICMSInter", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal pIcmsInter;

	@NotNull
	@XmlElement(name = "pICMSInterPart", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal pIcmsInterPart;

	@NotNull
	@XmlElement(name = "vFCPUFDest", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal vFcpUfDest;

	@NotNull
	@XmlElement(name = "vICMSUFDest", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal cIcmsUfDest;

	@NotNull
	@XmlElement(name = "vICMSUFRemet", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal vIcmsUfRemet;

}
