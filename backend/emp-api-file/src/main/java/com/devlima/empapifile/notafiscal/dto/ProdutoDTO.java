package com.devlima.empapifile.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlType(name = "Produto", propOrder = { "xmlnsNfe", "codigoProduto", "cean", "descricao", "ncm", "cest", "cfop",
		"ucom", "quantidadeComprada", "valorUnidadeComprada", "valorProduto", "ceanTrib", "uTrib", "qTrib", "vUnTrib",
		"vFrete", "indTot", "xPed", "nItemPed" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlElement(name = "cProd", namespace = xmlnsNfe)
	private String codigoProduto;

	@NotBlank
	@XmlElement(name = "cEAN", namespace = xmlnsNfe)
	private String cean;

	@NotBlank
	@XmlElement(name = "xProd", namespace = xmlnsNfe)
	private String descricao;

	@NotBlank
	@XmlElement(name = "NCM", namespace = xmlnsNfe)
	private String ncm;

	@NotBlank
	@XmlElement(name = "CEST", namespace = xmlnsNfe)
	private String cest;

	@NotBlank
	@XmlElement(name = "CFOP", namespace = xmlnsNfe)
	private String cfop;

	@NotBlank
	@XmlElement(name = "uCom", namespace = xmlnsNfe)
	private String ucom;

	@NotBlank
	@XmlElement(name = "qCom", namespace = xmlnsNfe)
	private String quantidadeComprada;

	@NotBlank
	@XmlElement(name = "vUnCom", namespace = xmlnsNfe)
	private String valorUnidadeComprada;

	@NotBlank
	@XmlElement(name = "vProd", namespace = xmlnsNfe)
	private String valorProduto;

	@NotBlank
	@XmlElement(name = "cEANTrib", namespace = xmlnsNfe)
	private String ceanTrib;

	@NotBlank
	@XmlElement(name = "uTrib", namespace = xmlnsNfe)
	private String uTrib;

	@NotBlank
	@XmlElement(name = "qTrib", namespace = xmlnsNfe)
	private String qTrib;

	@NotBlank
	@XmlElement(name = "vUnTrib", namespace = xmlnsNfe)
	private String vUnTrib;

	@NotBlank
	@XmlElement(name = "vFrete", namespace = xmlnsNfe)
	private String vFrete;

	@NotBlank
	@XmlElement(name = "indTot", namespace = xmlnsNfe)
	private String indTot;

	@NotBlank
	@XmlElement(name = "xPed", namespace = xmlnsNfe)
	private String xPed;

	@NotBlank
	@XmlElement(name = "nItemPed", namespace = xmlnsNfe)
	private String nItemPed;

}
