package com.devlima.empfiscal.notafiscal.unmarshall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Destinatario {

	private String cnpj;
	private String cpf;
	private String nome;
	private Endereco endereco;
	private String indIeDest;

}
