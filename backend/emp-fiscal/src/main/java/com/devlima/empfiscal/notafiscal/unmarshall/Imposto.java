package com.devlima.empfiscal.notafiscal.unmarshall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Imposto {

	private Icms icms;
	private Pis pis;
	private Cofins cofins;
	private IcmsUfDest icmsUfDest;

}
