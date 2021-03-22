package com.devlima.empfiscal.notafiscal.unmarshall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transportadora {

	private String cnpj;
	private String nome;
	private String ie;
	private String ender;
	private String municipio;
	private String uf;

}
