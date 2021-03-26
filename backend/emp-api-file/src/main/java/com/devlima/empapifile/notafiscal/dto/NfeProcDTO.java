package com.devlima.empapifile.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "nfeProc", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlType(name = "NfeProc", propOrder = { "xmlnsNfe", "nfe", "protNfe", "versao" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NfeProcDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotNull
	@XmlElement(name = "NFe", namespace = xmlnsNfe)
	private NfeDTO nfe;

	@NotNull
	@XmlElement(name = "protNFe", namespace = xmlnsNfe)
	private ProtNfeDTO protNfe;

	@NotBlank
	@XmlAttribute
	private String versao;

}
