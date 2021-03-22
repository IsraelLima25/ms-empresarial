package com.devlima.empfiscal.notafiscal.unmarshall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

	private String codigoProduto;
	private String cean;
	private String descricao;
	private String ncm;
	private String cest;
	private String cfop;
	private String ucom;
	private String quantidadeComprada;
	private String valorUnidadeComprada;
	private String valorProduto;
	private String ceanTrib;
	private String uTrib;
	private String qTrib;
	private String vUnTrib;
	private String vFrete;
	private String indTot;
	private String xPed;
	private String nItemPed;
}
