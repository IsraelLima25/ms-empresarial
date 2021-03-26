package com.devlima.empapifile.notafiscal.service;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.devlima.empapifile.file.enun.FolderType;
import com.devlima.empapifile.file.service.FileStorageService;
import com.devlima.empapifile.notafiscal.dto.NfeProcDTO;

@Service
public class NotaFiscalFileService {

	@Autowired
	private FileStorageService fileStorageService;

	public NfeProcDTO unmarshallXMLNotaFiscalFile(Resource resource)
			throws JAXBException, IllegalStateException, IOException {

		JAXBContext context = JAXBContext.newInstance(NfeProcDTO.class);
		File file = resource.getFile();
		return (NfeProcDTO) context.createUnmarshaller().unmarshal(file);
	}

	public String saveFileNFeDirectory(MultipartFile multipartFile, FolderType folder) {

		String fileName = fileStorageService.storeFile(multipartFile, folder);
		return fileName;
	}

	public Resource loadFileNFeDirectory(String fileName, FolderType folder) {
		
		Resource resourceFileLoad = fileStorageService.loadFileAsResource(fileName, folder);
		return resourceFileLoad;
	}
}
