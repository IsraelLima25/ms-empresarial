package com.devlima.empfiscal.notafiscal.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DuplicataDTO {
	
	@NotBlank
	private String numero;
	
	@NotNull
	private LocalDate dataVencimento;
	
	@NotNull
	private BigDecimal valor;

}
