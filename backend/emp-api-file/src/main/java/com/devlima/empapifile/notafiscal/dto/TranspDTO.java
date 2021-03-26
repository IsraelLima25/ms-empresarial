package com.devlima.empapifile.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "transp")
@XmlType(name = "Transp", propOrder = { "xmlnsNfe", "modFrete", "transportadora", "volume" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TranspDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@NotBlank
	@XmlElement(name = "modFrete", namespace = xmlnsNfe)
	private String modFrete;

	@NotNull
	@XmlElement(name = "transporta", namespace = xmlnsNfe)
	private TransportadoraDTO transportadora;

	@NotNull
	@XmlElement(name = "vol", namespace = xmlnsNfe)
	private VolumeDTO volume;

}
