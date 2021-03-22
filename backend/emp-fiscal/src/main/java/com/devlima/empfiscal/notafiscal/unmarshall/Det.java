package com.devlima.empfiscal.notafiscal.unmarshall;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Det {

	private String numeroItem;
	private Produto produto;
	private Imposto imposto;
	private String infAdProd;

}
