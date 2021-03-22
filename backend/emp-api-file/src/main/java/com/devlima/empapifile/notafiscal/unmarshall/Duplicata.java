package com.devlima.empapifile.notafiscal.unmarshall;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.devlima.empapifile.adapter.BigDecimalAdapter;
import com.devlima.empapifile.adapter.LocalDateAdapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlType(name = "Duplicata", propOrder = { "xmlnsNfe", "numero", "dataVencimento", "valor" })
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Duplicata {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";

	@XmlElement(name = "nDup", namespace = xmlnsNfe)
	private String numero;

	@XmlElement(name = "dVenc", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate dataVencimento;

	@XmlElement(name = "vDup", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal valor;

}
