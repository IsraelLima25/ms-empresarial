package com.devlima.empfiscal.notafiscal.unmarshall;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IcmsOO {

	private String orig;
	private String cst;
	private String modBc;
	private BigDecimal vBc;
	private BigDecimal pIcms;
	private BigDecimal vIcms;

}
