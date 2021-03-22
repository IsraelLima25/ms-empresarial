package com.devlima.empapifile.notafiscal.unmarshall;

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
public class Produto {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "cProd", namespace = xmlnsNfe)
	private String codigoProduto;

	@XmlElement(name = "cEAN", namespace = xmlnsNfe)
	private String cean;

	@XmlElement(name = "xProd", namespace = xmlnsNfe)
	private String descricao;

	@XmlElement(name = "NCM", namespace = xmlnsNfe)
	private String ncm;

	@XmlElement(name = "CEST", namespace = xmlnsNfe)
	private String cest;

	@XmlElement(name = "CFOP", namespace = xmlnsNfe)
	private String cfop;

	@XmlElement(name = "uCom", namespace = xmlnsNfe)
	private String ucom;

	@XmlElement(name = "qCom", namespace = xmlnsNfe)
	private String quantidadeComprada;

	@XmlElement(name = "vUnCom", namespace = xmlnsNfe)
	private String valorUnidadeComprada;

	@XmlElement(name = "vProd", namespace = xmlnsNfe)
	private String valorProduto;

	@XmlElement(name = "cEANTrib", namespace = xmlnsNfe)
	private String ceanTrib;

	@XmlElement(name = "uTrib", namespace = xmlnsNfe)
	private String uTrib;

	@XmlElement(name = "qTrib", namespace = xmlnsNfe)
	private String qTrib;

	@XmlElement(name = "vUnTrib", namespace = xmlnsNfe)
	private String vUnTrib;

	@XmlElement(name = "vFrete", namespace = xmlnsNfe)
	private String vFrete;

	@XmlElement(name = "indTot", namespace = xmlnsNfe)
	private String indTot;

	@XmlElement(name = "xPed", namespace = xmlnsNfe)
	private String xPed;

	@XmlElement(name = "nItemPed", namespace = xmlnsNfe)
	private String nItemPed;

}
