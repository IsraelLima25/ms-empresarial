package com.devlima.empfiscal.notafiscal.unmarshall;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IcmsUfDest {

	private BigDecimal vbcufDest;
	private BigDecimal pFcpUfDest;
	private BigDecimal pIcmsUfDest;
	private BigDecimal pIcmsInter;
	private BigDecimal pIcmsInterPart;
	private BigDecimal vFcpUfDest;
	private BigDecimal cIcmsUfDest;
	private BigDecimal vIcmsUfRemet;

}
