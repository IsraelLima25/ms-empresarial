package com.devlima.empapifile.notafiscal.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.devlima.empapifile.notafiscal.unmarshall.NfeProc;

@Service
public class NotaFiscalFileService {

	public NfeProc extractNotaFiscalXMLToDTO(MultipartFile xmlNfFile) throws JAXBException, IllegalStateException, IOException {
		
		NfeProc notaFiscalOBJDTO = unmarshallXMLNotaFiscalFile(xmlNfFile);
		return notaFiscalOBJDTO;
	}
	
	private NfeProc unmarshallXMLNotaFiscalFile(MultipartFile xmlNfFile) throws JAXBException, IllegalStateException, IOException {
		
		String storageLocationTmp = "/home/israel/upload-emp/xmlFile.xml";
		
		Path targetLocation = Path.of(storageLocationTmp);
        Files.copy(xmlNfFile.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
        
        File file = new File(storageLocationTmp);
        
        JAXBContext context = JAXBContext.newInstance(NfeProc.class);
		
		xmlNfFile.transferTo(file);
		
		return (NfeProc) context.createUnmarshaller().unmarshal(file);
	}
}
