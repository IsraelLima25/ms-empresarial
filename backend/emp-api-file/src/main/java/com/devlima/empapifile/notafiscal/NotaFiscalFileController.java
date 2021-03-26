package com.devlima.empapifile.notafiscal;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.devlima.empapifile.file.enun.FolderType;
import com.devlima.empapifile.notafiscal.dto.NfeProcDTO;
import com.devlima.empapifile.notafiscal.service.NotaFiscalFileService;

@RestController
@RequestMapping(value = "/notasFiscaisFile")
public class NotaFiscalFileController {
	
	@Autowired
	private NotaFiscalFileService notaFiscalFileService;
	
	private static final Logger logger = LoggerFactory.getLogger(NotaFiscalFileController.class);

	@PostMapping("/entradaFile")
	public ResponseEntity<NfeProcDTO> entradaFileNotaFiscalXML(@RequestPart("file") MultipartFile xmlNfFile) 
			throws IllegalStateException, JAXBException, IOException{
		
		logger.info("Start input xml file");
		
		String fileSaveName = notaFiscalFileService
				.saveFileNFeDirectory(xmlNfFile, FolderType.NF);
		
		Resource resourceFile = notaFiscalFileService
				.loadFileNFeDirectory(fileSaveName, FolderType.NF);
		
		NfeProcDTO notaFiscalDTO = notaFiscalFileService.unmarshallXMLNotaFiscalFile(resourceFile);
		return ResponseEntity.ok(notaFiscalDTO);
	}
}
