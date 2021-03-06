package com.devlima.empfiscal.notafiscal.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.devlima.empfiscal.notafiscal.dto.NfeProcDTO;

@Component
@FeignClient(name = "emp-api-file", path = "/notasFiscaisFile")
public interface FileFeignClient {
	
	@PostMapping(value = "/entradaFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<NfeProcDTO> entradaFileNotaFiscalXML(@RequestPart("file") MultipartFile xmlNfFile);
	
}
