package com.devlima.empfiscal.notafiscal.unmarshall;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CofinsAliq {

	private String cst;
	private BigDecimal vBc;
	private BigDecimal pCofins;
	private BigDecimal vCofins;
}
