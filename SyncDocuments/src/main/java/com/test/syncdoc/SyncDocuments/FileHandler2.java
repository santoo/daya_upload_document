package com.test.syncdoc.SyncDocuments;
import java.io.File;

public class FileHandler2 {
	static File dir = new File("C:\\Users\\SanthoshkumarSivaji\\Documents\\Downloads");

	public static void main(String[] args) {
		String directoryPath=new FileHandler2().searchDirectoryByName("New folder");
		File[] directoryListing=new FileHandler2().getFilesInDirectory(directoryPath);
		if (directoryListing != null) {
			for (File child : directoryListing) {
				System.out.println(child.getName());
			}
		}
	}

	public String searchDirectoryByName(String name) {
		File[] directoryListing = dir.listFiles();
		String path = null;
		if (directoryListing != null) {
			for (File child : directoryListing) {
				if (child.getName().matches("(.*)"+name+"(.*)") && child.isDirectory()) {
					return child.getPath();
				}
			}
		}

		return path;
	}

	public File[] getFilesInDirectory(String directoryPath) {
		File dir = new File(directoryPath);
		if (dir.isDirectory()) {
			return dir.listFiles();
		} else {
			return null;
		}
	}

}
