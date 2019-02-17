package com.test.syncdoc.SyncDocuments;

import java.io.File;

public class JavaFileHandler {
	File dir = new File("C:\\Users\\santh\\Downloads\\camunda-bpm-tomcat-7.10.0");

	public File searchDirectory(String directoryName) {
		File[] fileList = dir.listFiles();
		if (fileList != null) {
			for (File file : fileList) {
				if (file.isDirectory()) {
					if (file.getName().equalsIgnoreCase(directoryName)) {
						return file.getAbsoluteFile();
					}
				}
			}
		}
		return null;
	}

	public File[] listFilesInDirectory(File directory) {
		File[] fileList = directory.listFiles();
		if (directory.isDirectory()) {
			System.out.println("[" + directory.getName() + "]");
			File[] files = directory.listFiles();
			for (int i = 0; i < files.length; i++) {
				fileList[i] = files[i];
			}
		}
		return fileList;
	}
}
