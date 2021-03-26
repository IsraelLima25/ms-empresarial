package com.devlima.empapifile.file.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UploadResponseDTO {

	private String fileName;
	private String fileDownloadUri;
	private String fileType;
	private long size;

}
