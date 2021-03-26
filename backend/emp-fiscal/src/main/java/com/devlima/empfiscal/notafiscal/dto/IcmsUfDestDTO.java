package com.devlima.empfiscal.notafiscal.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IcmsUfDestDTO {

	@NotNull
	private BigDecimal vbcufDest;

	@NotNull
	private BigDecimal pFcpUfDest;

	@NotNull
	private BigDecimal pIcmsUfDest;

	@NotNull
	private BigDecimal pIcmsInter;

	@NotNull
	private BigDecimal pIcmsInterPart;

	@NotNull
	private BigDecimal vFcpUfDest;

	@NotNull
	private BigDecimal cIcmsUfDest;

	@NotNull
	private BigDecimal vIcmsUfRemet;

}
