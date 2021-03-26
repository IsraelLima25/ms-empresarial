package com.devlima.empfiscal.notafiscal.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CobrancaDTO {
	
	@NotNull
	private FaturaDTO fatura;
	
	@NotNull
	private List<DuplicataDTO> duplicatas;

}
