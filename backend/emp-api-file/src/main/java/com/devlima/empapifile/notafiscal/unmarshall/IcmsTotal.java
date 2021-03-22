package com.devlima.empapifile.notafiscal.unmarshall;

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
public class IcmsTotal {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "vBC", namespace = xmlnsNfe)
	private String vBc;

	@XmlElement(name = "vICMSDeson", namespace = xmlnsNfe)
	private String vIcmsDeson;

	@XmlElement(name = "vICMS", namespace = xmlnsNfe)
	private String vIcms;

	@XmlElement(name = "vFCPUFDest", namespace = xmlnsNfe)
	private String vFcpUfDest;

	@XmlElement(name = "vICMSUFDest", namespace = xmlnsNfe)
	private String vIcmsUfDest;

	@XmlElement(name = "vFCP", namespace = xmlnsNfe)
	private String vFcp;

	@XmlElement(name = "vBCST", namespace = xmlnsNfe)
	private String vBcst;

	@XmlElement(name = "VST", namespace = xmlnsNfe)
	private String vst;

	@XmlElement(name = "vFCPST", namespace = xmlnsNfe)
	private String vFCPST;

	@XmlElement(name = "vFCPSTRet", namespace = xmlnsNfe)
	private String vFCPSTRet;

	@XmlElement(name = "vProd", namespace = xmlnsNfe)
	private String vProd;

	@XmlElement(name = "vFrete", namespace = xmlnsNfe)
	private String vFrete;

	@XmlElement(name = "vSeg", namespace = xmlnsNfe)
	private String vSeg;

	@XmlElement(name = "vDesc", namespace = xmlnsNfe)
	private String vDesc;

	@XmlElement(name = "vII", namespace = xmlnsNfe)
	private String vII;

	@XmlElement(name = "vIPI", namespace = xmlnsNfe)
	private String vIpi;

	@XmlElement(name = "vIPIDevol", namespace = xmlnsNfe)
	private String vIpiDevol;

	@XmlElement(name = "vPIS", namespace = xmlnsNfe)
	private String vPis;

	@XmlElement(name = "vCOFINS", namespace = xmlnsNfe)
	private String vCofins;

	@XmlElement(name = "vOutro", namespace = xmlnsNfe)
	private String vOutro;

	@XmlElement(name = "vNF", namespace = xmlnsNfe)
	private String vNf;

}
