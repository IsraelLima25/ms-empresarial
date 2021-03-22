package com.devlima.empfiscal.notafiscal.unmarshall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NfeProc {

	private Nfe nfe;
	private ProtNfe protNfe;
	private String versao;

}
