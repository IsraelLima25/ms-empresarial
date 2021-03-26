package com.devlima.empfiscal.notafiscal.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetDTO {
	
	@NotBlank
	private String numeroItem;
	
	@NotNull
	private ProdutoDTO produto;
	
	@NotNull
	private ImpostoDTO imposto;
	
	@NotBlank
	private String infAdProd;

}
