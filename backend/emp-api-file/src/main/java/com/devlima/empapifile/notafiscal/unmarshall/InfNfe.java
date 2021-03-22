package com.devlima.empapifile.notafiscal.unmarshall;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "infNFe")
@XmlType(name = "InfNfe", propOrder = { "xmlnsNfe", "versao", "id", "identificador", "emitente", "destinatario", "dets",
		"total", "transp", "cobranca", "pagamento", "informacaoAdicional" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfNfe {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlAttribute
	private String versao;

	@XmlAttribute(name = "Id")
	private String id;

	@XmlElement(name = "ide", namespace = xmlnsNfe)
	private Identificador identificador;

	@XmlElement(name = "emit", namespace = xmlnsNfe)
	private Emitente emitente;

	@XmlElement(name = "dest", namespace = xmlnsNfe)
	private Destinatario destinatario;

	@XmlElement(name = "det", namespace = xmlnsNfe)
	private List<Det> dets;

	@XmlElement(name = "total", namespace = xmlnsNfe)
	private Total total;

	@XmlElement(name = "transp", namespace = xmlnsNfe)
	private Transp transp;

	@XmlElement(name = "cobr", namespace = xmlnsNfe)
	private Cobranca cobranca;

	@XmlElement(name = "pag", namespace = xmlnsNfe)
	private Pagamento pagamento;

	@XmlElement(name = "infAdic", namespace = xmlnsNfe)
	private InformacaoAdicional informacaoAdicional;

}
