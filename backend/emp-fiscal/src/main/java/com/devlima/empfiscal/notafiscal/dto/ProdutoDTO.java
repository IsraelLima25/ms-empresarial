package com.devlima.empfiscal.notafiscal.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

	@NotBlank
	private String codigoProduto;

	@NotBlank
	private String cean;

	@NotBlank
	private String descricao;

	@NotBlank
	private String ncm;

	@NotBlank
	private String cest;

	@NotBlank
	private String cfop;

	@NotBlank
	private String ucom;

	@NotBlank
	private String quantidadeComprada;

	@NotBlank
	private String valorUnidadeComprada;

	@NotBlank
	private String valorProduto;

	@NotBlank
	private String ceanTrib;

	@NotBlank
	private String uTrib;

	@NotBlank
	private String qTrib;

	@NotBlank
	private String vUnTrib;

	@NotBlank
	private String vFrete;

	@NotBlank
	private String indTot;

	@NotBlank
	private String xPed;

	@NotBlank
	private String nItemPed;
}
