package com.devlima.empapifile.notafiscal.dto;

import java.util.List;

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

@XmlRootElement(name = "infNFe")
@XmlType(name = "InfNfe", propOrder = { "xmlnsNfe", "versao", "id", "identificador", "emitente", "destinatario", "dets",
		"total", "transp", "cobranca", "pagamento", "informacaoAdicional" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfNfeDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlAttribute
	private String versao;

	@NotBlank
	@XmlAttribute(name = "Id")
	private String id;

	@NotNull
	@XmlElement(name = "ide", namespace = xmlnsNfe)
	private IdentificadorDTO identificador;

	@NotNull
	@XmlElement(name = "emit", namespace = xmlnsNfe)
	private EmitenteDTO emitente;

	@NotNull
	@XmlElement(name = "dest", namespace = xmlnsNfe)
	private DestinatarioDTO destinatario;

	@NotNull
	@XmlElement(name = "det", namespace = xmlnsNfe)
	private List<DetDTO> dets;

	@NotNull
	@XmlElement(name = "total", namespace = xmlnsNfe)
	private TotalDTO total;

	@NotNull
	@XmlElement(name = "transp", namespace = xmlnsNfe)
	private TranspDTO transp;

	@NotNull
	@XmlElement(name = "cobr", namespace = xmlnsNfe)
	private CobrancaDTO cobranca;

	@NotNull
	@XmlElement(name = "pag", namespace = xmlnsNfe)
	private PagamentoDTO pagamento;

	@NotNull
	@XmlElement(name = "infAdic", namespace = xmlnsNfe)
	private InformacaoAdicionalDTO informacaoAdicional;

}
