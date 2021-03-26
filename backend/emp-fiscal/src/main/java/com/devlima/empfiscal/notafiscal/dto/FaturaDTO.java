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
public class FaturaDTO {
	
	@NotBlank
	private String numero;
	
	@NotNull
	private BigDecimal valorOriginal;
	
	@NotNull
	private BigDecimal valorLiquido;

}
