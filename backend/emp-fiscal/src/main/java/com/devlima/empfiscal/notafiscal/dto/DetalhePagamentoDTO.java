package com.devlima.empfiscal.notafiscal.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalhePagamentoDTO {
	
	@NotBlank
	private String indPag;
	
	@NotBlank
	private String tPag;
	
	@NotBlank
	private String vPag;

}
