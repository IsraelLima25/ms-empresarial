package com.devlima.empfiscal.notafiscal.unmarshall;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfNfe {

	private String versao;
	private String id;
	private Identificador identificador;
	private Emitente emitente;
	private Destinatario destinatario;
	private List<Det> dets;
	private Total total;
	private Transp transp;
	private Cobranca cobranca;
	private Pagamento pagamento;
	private InformacaoAdicional informacaoAdicional;

}
