package com.devlima.empapifile.notafiscal;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.devlima.empapifile.notafiscal.service.NotaFiscalFileService;
import com.devlima.empapifile.notafiscal.unmarshall.NfeProc;

@RestController
@RequestMapping(value = "/notasFiscaisFile")
public class NotaFiscalFileController {
	
	@Autowired
	private NotaFiscalFileService notaFiscalFileService;
	
    private static final Logger logger = LoggerFactory.getLogger(NotaFiscalFileController.class);

	@PostMapping("/entradaFile")
	public ResponseEntity<NfeProc> entradaFileNotaFiscalXML(
			@RequestPart("file") MultipartFile xmlNfFile) throws IllegalStateException, JAXBException, IOException{
		
		logger.info("Start input xml file");
		
		NfeProc notaFiscalDTO = notaFiscalFileService.extractNotaFiscalXMLToDTO(xmlNfFile);
		
		return ResponseEntity.ok(notaFiscalDTO);
	}
}
