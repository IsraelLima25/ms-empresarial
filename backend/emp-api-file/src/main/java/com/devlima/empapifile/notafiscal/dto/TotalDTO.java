package com.devlima.empapifile.notafiscal.dto;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "total")
@XmlType(name = "Total", propOrder = { "xmlnsNfe", "icmsTotal" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TotalDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotNull
	@XmlElement(name = "ICMSTot", namespace = xmlnsNfe)
	private IcmsTotalDTO icmsTotal;

}
