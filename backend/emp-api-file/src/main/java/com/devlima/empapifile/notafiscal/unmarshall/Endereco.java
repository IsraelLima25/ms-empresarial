package com.devlima.empapifile.notafiscal.unmarshall;

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
public class Endereco {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "xLgr", namespace = xmlnsNfe)
	private String logradouro;

	@XmlElement(name = "nro", namespace = xmlnsNfe)
	private String numero;

	@XmlElement(name = "xCpl", namespace = xmlnsNfe)
	private String complemento;

	@XmlElement(name = "xBairro", namespace = xmlnsNfe)
	private String bairro;

	@XmlElement(name = "cMun", namespace = xmlnsNfe)
	private String codigoMunicipio;

	@XmlElement(name = "xMun", namespace = xmlnsNfe)
	private String municipio;

	@XmlElement(name = "UF", namespace = xmlnsNfe)
	private String uf;

	@XmlElement(name = "CEP", namespace = xmlnsNfe)
	private String cep;

	@XmlElement(name = "cPais", namespace = xmlnsNfe)
	private String codigoPais;

	@XmlElement(name = "xPais", namespace = xmlnsNfe)
	private String pais;

	@XmlElement(name = "fone", namespace = xmlnsNfe)
	private String telefone;

}
