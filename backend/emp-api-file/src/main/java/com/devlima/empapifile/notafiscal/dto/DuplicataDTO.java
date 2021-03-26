package com.devlima.empapifile.notafiscal.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
public class DuplicataDTO {

	private final String xmlnsNfe = "http://www.portalfiscal.inf.br/nfe";
	
	@NotBlank
	@XmlElement(name = "nDup", namespace = xmlnsNfe)
	private String numero;

	@NotNull
	@XmlElement(name = "dVenc", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate dataVencimento;

	@NotNull
	@XmlElement(name = "vDup", namespace = xmlnsNfe)
	@XmlJavaTypeAdapter(BigDecimalAdapter.class)
	private BigDecimal valor;

}
