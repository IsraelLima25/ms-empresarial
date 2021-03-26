package com.devlima.empapifile.notafiscal.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
public class IdentificadorDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlElement(name = "cUF", namespace = xmlnsNfe)
	private String uf;

	@NotBlank
	@XmlElement(name = "cNF", namespace = xmlnsNfe)
	private String cNf;
	
	@NotBlank
	@XmlElement(name = "natOp", namespace = xmlnsNfe)
	private String naturezaOperacao;

	@NotBlank
	@XmlElement(name = "mod", namespace = xmlnsNfe)
	private String mod;

	@NotBlank
	@XmlElement(name = "serie", namespace = xmlnsNfe)
	private String serie;

	@NotBlank
	@XmlElement(name = "nNF", namespace = xmlnsNfe)
	private String numeroNF;

	@NotNull
	@XmlElement(name = "dhEmi", namespace = xmlnsNfe, required = true)
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime dataHoraEmissao;

	@NotNull
	@XmlElement(name = "dhSaiEnt", namespace = xmlnsNfe, required = true)
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	private LocalDateTime dataHoraSaidaEntrada;

	@NotBlank
	@XmlElement(name = "tpNF", namespace = xmlnsNfe)
	private String tipoNF;

	@NotBlank
	@XmlElement(name = "idDest", namespace = xmlnsNfe)
	private String idDestinatario;

	@NotBlank
	@XmlElement(name = "cMunFG", namespace = xmlnsNfe)
	private String cMunFG;

	@NotBlank
	@XmlElement(name = "tpImp", namespace = xmlnsNfe)
	private String tpImp;

	@NotBlank
	@XmlElement(name = "tpEmis", namespace = xmlnsNfe)
	private String tpEmis;

	@NotBlank
	@XmlElement(name = "cDV", namespace = xmlnsNfe)
	private String cDV;

	@NotBlank
	@XmlElement(name = "tpAmb", namespace = xmlnsNfe)
	private String tpAmb;

	@NotBlank
	@XmlElement(name = "finNFe", namespace = xmlnsNfe)
	private String finNFe;

	@NotBlank
	@XmlElement(name = "indFinal", namespace = xmlnsNfe)
	private String indFinal;

	@NotBlank
	@XmlElement(name = "indPres", namespace = xmlnsNfe)
	private String indPres;

	@NotBlank
	@XmlElement(name = "procEmi", namespace = xmlnsNfe)
	private String procEmi;

	@NotBlank
	@XmlElement(name = "verProc", namespace = xmlnsNfe)
	private String verProc;

}
