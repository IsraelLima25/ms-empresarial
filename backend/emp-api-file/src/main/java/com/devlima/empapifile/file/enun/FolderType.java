package com.devlima.empapifile.file.enun;

public enum FolderType {

	NF("notas-fiscais");

	private String nameFolder;

	private FolderType(String nameFolder) {
		this.nameFolder = nameFolder;
	}
	
	public String getNameFolder() {
		return nameFolder;
	}
	
	public static FolderType toEnum(String folderName) {

		if (folderName == null) {
			return null;
		}

		for (FolderType folderType : FolderType.values()) {
			if (folderName.equals(folderType.getNameFolder())) {
				return folderType;
			}
		}

		throw new IllegalArgumentException("Folder Invalid " + folderName);
	}
}
