package com.devlima.empfiscal.notafiscal.unmarshall;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Volume {

	private String quantidade;
	private BigDecimal pesoL;
	private BigDecimal pesoB;

}
