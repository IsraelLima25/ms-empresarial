package com.devlima.empapifile.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "enderEmit")
@XmlType(name = "EnderecoEmitente", propOrder = { "xmlnsNfe", "logradouro", "numero", "complemento", "bairro",
		"codigoMunicipio", "municipio", "uf", "cep", "codigoPais", "pais", "telefone" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlElement(name = "xLgr", namespace = xmlnsNfe)
	private String logradouro;

	@NotBlank
	@XmlElement(name = "nro", namespace = xmlnsNfe)
	private String numero;

	@NotBlank
	@XmlElement(name = "xCpl", namespace = xmlnsNfe)
	private String complemento;

	@NotBlank
	@XmlElement(name = "xBairro", namespace = xmlnsNfe)
	private String bairro;

	@NotBlank
	@XmlElement(name = "cMun", namespace = xmlnsNfe)
	private String codigoMunicipio;

	@NotBlank
	@XmlElement(name = "xMun", namespace = xmlnsNfe)
	private String municipio;

	@NotBlank
	@XmlElement(name = "UF", namespace = xmlnsNfe)
	private String uf;

	@NotBlank
	@XmlElement(name = "CEP", namespace = xmlnsNfe)
	private String cep;

	@NotBlank
	@XmlElement(name = "cPais", namespace = xmlnsNfe)
	private String codigoPais;

	@NotBlank
	@XmlElement(name = "xPais", namespace = xmlnsNfe)
	private String pais;

	@NotBlank
	@XmlElement(name = "fone", namespace = xmlnsNfe)
	private String telefone;

}
