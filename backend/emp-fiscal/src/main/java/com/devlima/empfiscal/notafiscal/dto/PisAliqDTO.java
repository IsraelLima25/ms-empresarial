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
public class PisAliqDTO {
	
	@NotBlank
	private String cst;
	
	@NotNull
	private BigDecimal vBc;
	
	@NotNull
	private BigDecimal pPis;
	
	@NotNull
	private BigDecimal vPis;

}
