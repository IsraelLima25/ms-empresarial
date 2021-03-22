package com.devlima.empapifile.notafiscal.unmarshall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "det")
@XmlType(name = "Det", propOrder = { "xmlnsNfe", "numeroItem", "produto", "imposto", "infAdProd" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Det {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlAttribute(name = "nItem")
	private String numeroItem;

	@XmlElement(name = "prod", namespace = xmlnsNfe)
	private Produto produto;

	@XmlElement(name = "imposto", namespace = xmlnsNfe)
	private Imposto imposto;

	@XmlElement(name = "infAdProd", namespace = xmlnsNfe)
	private String infAdProd;

}
