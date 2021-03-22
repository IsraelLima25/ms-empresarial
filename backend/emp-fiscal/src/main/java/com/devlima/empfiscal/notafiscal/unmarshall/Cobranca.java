package com.devlima.empfiscal.notafiscal.unmarshall;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cobranca {

	private Fatura fatura;
	private List<Duplicata> duplicatas;

}
