package com.devlima.empfiscal.notafiscal.unmarshall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String codigoMunicipio;
	private String municipio;
	private String uf;
	private String cep;
	private String codigoPais;
	private String pais;
	private String telefone;

}
