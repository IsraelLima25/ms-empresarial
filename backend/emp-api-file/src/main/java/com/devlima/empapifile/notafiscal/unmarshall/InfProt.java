package com.devlima.empapifile.notafiscal.unmarshall;

import java.time.LocalDateTime;

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
public class InfProt {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "tpAmb", namespace = xmlnsNfe)
	private String tpAmb;

	@XmlElement(name = "verAplic", namespace = xmlnsNfe)
	private String verAplic;

	@XmlElement(name = "chNFe", namespace = xmlnsNfe)
	private String chNFe;

	@XmlElement(name = "dhRecbto", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime dhRecbto;

	@XmlElement(name = "nProt", namespace = xmlnsNfe)
	private String nProt;

	@XmlElement(name = "digVal", namespace = xmlnsNfe)
	private String digVal;

	@XmlElement(name = "cStat", namespace = xmlnsNfe)
	private String cStat;

	@XmlElement(name = "xMotivo", namespace = xmlnsNfe)
	private String xMotivo;

}
