package com.devlima.empfiscal.notafiscal.unmarshall;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Identificador {

	private String uf;
	private String cNf;
	private String naturezaOperacao;
	private String mod;
	private String serie;
	private String numeroNF;
	private LocalDateTime dataHoraEmissao;
	private LocalDateTime dataHoraSaidaEntrada;
	private String tipoNF;
	private String idDestinatario;
	private String cMunFG;
	private String tpImp;
	private String tpEmis;
	private String cDV;
	private String tpAmb;
	private String finNFe;
	private String indFinal;
	private String indPres;
	private String procEmi;
	private String verProc;

}
