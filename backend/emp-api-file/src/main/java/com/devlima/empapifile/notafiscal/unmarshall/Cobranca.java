package com.devlima.empapifile.notafiscal.unmarshall;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "cobr")
@XmlType(name = "Cobranca", propOrder = { "xmlnsNfe", "fatura", "duplicatas" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cobranca {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "fat", namespace = xmlnsNfe)
	private Fatura fatura;

	@XmlElement(name = "dup", namespace = xmlnsNfe)
	private List<Duplicata> duplicatas;

}
