package com.devlima.empfiscal.notafiscal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.devlima.empfiscal.feign.FileFeignClient;
import com.devlima.empfiscal.notafiscal.unmarshall.NfeProc;

@RestController
@RequestMapping(value = "/notasFiscais")
public class NotaFiscalController {
	
    private static final Logger logger = LoggerFactory.getLogger(NotaFiscalController.class);
    
    @Autowired
    private FileFeignClient fileClient;
    
    @PostMapping("/entrada")
    public ResponseEntity<NfeProc> enviarNotaFiscalEntrada(
    		@RequestPart("file") MultipartFile file){
    	
    	logger.info("Start input nf system");
    	
    	ResponseEntity<NfeProc> response = fileClient.entradaFileNotaFiscalXML(file);
    	
    	logger.info("A nota fiscal de entrada é a " + response.getBody()
    	.getNfe().getInformacaoNfe().getTransp().getTransportadora().getNome());
    	
    	return response;
    }
}
