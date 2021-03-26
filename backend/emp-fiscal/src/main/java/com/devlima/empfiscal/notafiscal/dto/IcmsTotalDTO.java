package com.devlima.empfiscal.notafiscal.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IcmsTotalDTO {
	
	@NotBlank
	private String vBc;
	
	@NotBlank
	private String vIcmsDeson;
	
	@NotBlank
	private String vIcms;
	
	@NotBlank
	private String vFcpUfDest;
	
	@NotBlank
	private String vIcmsUfDest;
	
	@NotBlank
	private String vFcp;
	
	@NotBlank
	private String vBcst;
	
	@NotBlank
	private String vst;
	
	@NotBlank
	private String vFCPST;
	
	@NotBlank
	private String vFCPSTRet;
	
	@NotBlank
	private String vProd;
	
	@NotBlank
	private String vFrete;
	
	@NotBlank
	private String vSeg;
	
	@NotBlank
	private String vDesc;
	
	@NotBlank
	private String vII;
	
	@NotBlank
	private String vIpi;
	
	@NotBlank
	private String vIpiDevol;
	
	@NotBlank
	private String vPis;
	
	@NotBlank
	private String vCofins;
	
	@NotBlank
	private String vOutro;
	
	@NotBlank
	private String vNf;

}
