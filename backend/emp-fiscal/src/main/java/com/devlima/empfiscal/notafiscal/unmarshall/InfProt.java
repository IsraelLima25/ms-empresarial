package com.devlima.empfiscal.notafiscal.unmarshall;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfProt {

	private String tpAmb;
	private String verAplic;
	private String chNFe;
	private LocalDateTime dhRecbto;
	private String nProt;
	private String digVal;
	private String cStat;
	private String xMotivo;

}
