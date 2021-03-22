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

@XmlRootElement(name = "ide")
@XmlType(name = "Identificador", propOrder = { "xmlnsNfe", "uf", "cNf", "naturezaOperacao", "mod", "serie", "numeroNF",
		"dataHoraEmissao", "dataHoraSaidaEntrada", "tipoNF", "idDestinatario", "cMunFG", "tpImp", "tpEmis", "cDV",
		"tpAmb", "finNFe", "indFinal", "indPres", "procEmi", "verProc" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Identificador {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "cUF", namespace = xmlnsNfe)
	private String uf;

	@XmlElement(name = "cNF", namespace = xmlnsNfe)
	private String cNf;

	@XmlElement(name = "natOp", namespace = xmlnsNfe)
	private String naturezaOperacao;

	@XmlElement(name = "mod", namespace = xmlnsNfe)
	private String mod;

	@XmlElement(name = "serie", namespace = xmlnsNfe)
	private String serie;

	@XmlElement(name = "nNF", namespace = xmlnsNfe)
	private String numeroNF;

	@XmlElement(name = "dhEmi", namespace = xmlnsNfe, required = true)
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime dataHoraEmissao;

	@XmlElement(name = "dhSaiEnt", namespace = xmlnsNfe, required = true)
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime dataHoraSaidaEntrada;

	@XmlElement(name = "tpNF", namespace = xmlnsNfe)
	private String tipoNF;

	@XmlElement(name = "idDest", namespace = xmlnsNfe)
	private String idDestinatario;

	@XmlElement(name = "cMunFG", namespace = xmlnsNfe)
	private String cMunFG;

	@XmlElement(name = "tpImp", namespace = xmlnsNfe)
	private String tpImp;

	@XmlElement(name = "tpEmis", namespace = xmlnsNfe)
	private String tpEmis;

	@XmlElement(name = "cDV", namespace = xmlnsNfe)
	private String cDV;

	@XmlElement(name = "tpAmb", namespace = xmlnsNfe)
	private String tpAmb;

	@XmlElement(name = "finNFe", namespace = xmlnsNfe)
	private String finNFe;

	@XmlElement(name = "indFinal", namespace = xmlnsNfe)
	private String indFinal;

	@XmlElement(name = "indPres", namespace = xmlnsNfe)
	private String indPres;

	@XmlElement(name = "procEmi", namespace = xmlnsNfe)
	private String procEmi;

	@XmlElement(name = "verProc", namespace = xmlnsNfe)
	private String verProc;

}
