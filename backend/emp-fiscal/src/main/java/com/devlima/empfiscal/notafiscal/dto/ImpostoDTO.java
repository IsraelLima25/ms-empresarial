package com.devlima.empfiscal.notafiscal.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImpostoDTO {
	
	@NotNull
	private IcmsDTO icms;
	
	@NotNull
	private PisDTO pis;
	
	@NotNull
	private CofinsDTO cofins;
	
	@NotNull
	private IcmsUfDestDTO icmsUfDest;

}
