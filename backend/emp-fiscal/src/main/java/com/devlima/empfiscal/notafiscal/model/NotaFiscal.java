package com.devlima.empfiscal.notafiscal.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_nota_fiscal")
public class NotaFiscal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String numero;
	
}
