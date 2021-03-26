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

@XmlRootElement(name = "ICMSTot")
@XmlType(name = "IcmsTotal", propOrder = { "xmlnsNfe", "vBc", "vIcmsDeson", "vIcms", "vFcpUfDest", "vIcmsUfDest",
		"vFcp", "vBcst", "vst", "vFCPST", "vFCPSTRet", "vProd", "vFrete", "vSeg", "vDesc", "vII", "vIpi", "vIpiDevol",
		"vPis", "vCofins", "vOutro", "vNf" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IcmsTotalDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlElement(name = "vBC", namespace = xmlnsNfe)
	private String vBc;

	@NotBlank
	@XmlElement(name = "vICMSDeson", namespace = xmlnsNfe)
	private String vIcmsDeson;

	@NotBlank
	@XmlElement(name = "vICMS", namespace = xmlnsNfe)
	private String vIcms;

	@NotBlank
	@XmlElement(name = "vFCPUFDest", namespace = xmlnsNfe)
	private String vFcpUfDest;

	@NotBlank
	@XmlElement(name = "vICMSUFDest", namespace = xmlnsNfe)
	private String vIcmsUfDest;

	@NotBlank
	@XmlElement(name = "vFCP", namespace = xmlnsNfe)
	private String vFcp;

	@NotBlank
	@XmlElement(name = "vBCST", namespace = xmlnsNfe)
	private String vBcst;

	@NotBlank
	@XmlElement(name = "VST", namespace = xmlnsNfe)
	private String vst;

	@NotBlank
	@XmlElement(name = "vFCPST", namespace = xmlnsNfe)
	private String vFCPST;

	@NotBlank
	@XmlElement(name = "vFCPSTRet", namespace = xmlnsNfe)
	private String vFCPSTRet;

	@NotBlank
	@XmlElement(name = "vProd", namespace = xmlnsNfe)
	private String vProd;

	@NotBlank
	@XmlElement(name = "vFrete", namespace = xmlnsNfe)
	private String vFrete;

	@NotBlank
	@XmlElement(name = "vSeg", namespace = xmlnsNfe)
	private String vSeg;

	@NotBlank
	@XmlElement(name = "vDesc", namespace = xmlnsNfe)
	private String vDesc;

	@NotBlank
	@XmlElement(name = "vII", namespace = xmlnsNfe)
	private String vII;

	@NotBlank
	@XmlElement(name = "vIPI", namespace = xmlnsNfe)
	private String vIpi;

	@NotBlank
	@XmlElement(name = "vIPIDevol", namespace = xmlnsNfe)
	private String vIpiDevol;

	@NotBlank
	@XmlElement(name = "vPIS", namespace = xmlnsNfe)
	private String vPis;

	@NotBlank
	@XmlElement(name = "vCOFINS", namespace = xmlnsNfe)
	private String vCofins;

	@NotBlank
	@XmlElement(name = "vOutro", namespace = xmlnsNfe)
	private String vOutro;

	@NotBlank
	@XmlElement(name = "vNF", namespace = xmlnsNfe)
	private String vNf;

}
