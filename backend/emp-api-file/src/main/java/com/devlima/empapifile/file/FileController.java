package com.devlima.empapifile.file;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devlima.empapifile.file.dto.UploadResponseDTO;
import com.devlima.empapifile.file.enun.FolderType;
import com.devlima.empapifile.file.service.FileStorageService;

@RestController
@RequestMapping(value = "/files")
public class FileController {

	private static final Logger logger = LoggerFactory.getLogger(FileController.class);

	@Autowired
	private FileStorageService fileStorageService;

	@PostMapping("/uploadFile")
	public UploadResponseDTO uploadFile(@RequestPart("file") MultipartFile file,
			@RequestParam("folder") String folder) {
		
		logger.info("Start uploading file");
		
		FolderType folderFind = FolderType.toEnum(folder);
		String fileName = fileStorageService.storeFile(file, folderFind);

		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
			.path("/downloadFile/")
			.path(fileName)
			.toUriString();
		
		return new UploadResponseDTO(fileName, fileDownloadUri, file.getContentType(), file.getSize());
	}
	
    @PostMapping("/uploadMultipleFiles")
    public List<UploadResponseDTO> uploadMultipleFiles(@RequestPart("files") MultipartFile[] files,
    		@RequestParam("folder") String folder) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file, folder))
                .collect(Collectors.toList());
    }
    
    @GetMapping("/{folder}/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request,
    		@PathVariable("folder") String folder) {
    	
    	FolderType folderFind = FolderType.toEnum(folder);
        Resource resource = fileStorageService.loadFileAsResource(fileName, folderFind);

        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
