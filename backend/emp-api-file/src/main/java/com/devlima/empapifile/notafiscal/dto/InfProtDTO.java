package com.devlima.empapifile.notafiscal.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.devlima.empapifile.adapter.LocalDateTimeAdapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "infProt", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlType(name = "InfProt", propOrder = { "xmlnsNfe", "tpAmb", "verAplic", "chNFe", "dhRecbto", "nProt", "digVal",
		"cStat", "xMotivo" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfProtDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlElement(name = "tpAmb", namespace = xmlnsNfe)
	private String tpAmb;

	@NotBlank
	@XmlElement(name = "verAplic", namespace = xmlnsNfe)
	private String verAplic;

	@NotBlank
	@XmlElement(name = "chNFe", namespace = xmlnsNfe)
	private String chNFe;

	@NotNull
	@XmlElement(name = "dhRecbto", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime dhRecbto;

	@NotBlank
	@XmlElement(name = "nProt", namespace = xmlnsNfe)
	private String nProt;

	@NotBlank
	@XmlElement(name = "digVal", namespace = xmlnsNfe)
	private String digVal;

	@NotBlank
	@XmlElement(name = "cStat", namespace = xmlnsNfe)
	private String cStat;

	@NotBlank
	@XmlElement(name = "xMotivo", namespace = xmlnsNfe)
	private String xMotivo;

}
