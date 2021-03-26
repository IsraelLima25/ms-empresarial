package com.devlima.empfiscal.notafiscal.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfNfeDTO {
	
	@NotBlank
	private String versao;
	
	@NotBlank
	private String id;
	
	@NotNull
	private IdentificadorDTO identificador;
	
	@NotNull
	private EmitenteDTO emitente;
	
	@NotNull
	private DestinatarioDTO destinatario;
	
	@NotNull
	private List<DetDTO> dets;
	
	@NotNull
	private TotalDTO total;
	
	@NotNull
	private TranspDTO transp;
	
	@NotNull
	private CobrancaDTO cobranca;
	
	@NotNull
	private PagamentoDTO pagamento;
	
	@NotNull
	private InformacaoAdicionalDTO informacaoAdicional;

}
