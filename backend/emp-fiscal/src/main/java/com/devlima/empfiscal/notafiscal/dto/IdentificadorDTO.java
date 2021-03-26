package com.devlima.empfiscal.notafiscal.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdentificadorDTO {

	@NotBlank
	private String uf;

	@NotBlank
	private String cNf;

	@NotBlank
	private String naturezaOperacao;

	@NotBlank
	private String mod;

	@NotBlank
	private String serie;

	@NotBlank
	private String numeroNF;

	@NotNull
	private LocalDateTime dataHoraEmissao;

	@NotNull
	private LocalDateTime dataHoraSaidaEntrada;

	@NotBlank
	private String tipoNF;

	@NotBlank
	private String idDestinatario;

	@NotBlank
	private String cMunFG;

	@NotBlank
	private String tpImp;

	@NotBlank
	private String tpEmis;

	@NotBlank
	private String cDV;

	@NotBlank
	private String tpAmb;

	@NotBlank
	private String finNFe;

	@NotBlank
	private String indFinal;

	@NotBlank
	private String indPres;

	@NotBlank
	private String procEmi;

	@NotBlank
	private String verProc;

}
