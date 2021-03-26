package com.devlima.empfiscal.notafiscal.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfProtDTO {

	@NotBlank
	private String tpAmb;

	@NotBlank
	private String verAplic;

	@NotBlank
	private String chNFe;

	@NotNull
	private LocalDateTime dhRecbto;

	@NotBlank
	private String nProt;

	@NotBlank
	private String digVal;

	@NotBlank
	private String cStat;

	@NotBlank
	private String xMotivo;

}
