package com.devlima.empfiscal.notafiscal.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IcmsOODTO {

	@NotBlank
	private String orig;

	@NotBlank
	private String cst;

	@NotBlank
	private String modBc;

	@NotNull
	private BigDecimal vBc;

	@NotNull
	private BigDecimal pIcms;

	@NotNull
	private BigDecimal vIcms;

}
