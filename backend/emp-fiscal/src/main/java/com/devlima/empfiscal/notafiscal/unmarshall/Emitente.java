package com.devlima.empfiscal.notafiscal.unmarshall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emitente {

	private String cnpj;
	private String cpf;
	private String razaoSocial;
	private String nomeFantasia;
	private Endereco endereco;
	private String ie;
	private String iest;
	private String crt;

}
