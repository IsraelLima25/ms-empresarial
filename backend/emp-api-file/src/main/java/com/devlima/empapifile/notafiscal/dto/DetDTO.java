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

@XmlRootElement(name = "det")
@XmlType(name = "Det", propOrder = { "xmlnsNfe", "numeroItem", "produto", "imposto", "infAdProd" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlAttribute(name = "nItem")
	private String numeroItem;

	@NotNull
	@XmlElement(name = "prod", namespace = xmlnsNfe)
	private ProdutoDTO produto;

	@NotNull
	@XmlElement(name = "imposto", namespace = xmlnsNfe)
	private ImpostoDTO imposto;

	@NotBlank
	@XmlElement(name = "infAdProd", namespace = xmlnsNfe)
	private String infAdProd;

}
