package com.devlima.empfiscal.notafiscal.unmarshall;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Duplicata {

	private String numero;
	private LocalDate dataVencimento;
	private BigDecimal valor;

}
