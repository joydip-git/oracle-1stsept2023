package com.java.abstractclassdemo.entities;

public abstract class FileReader implements DataAccess{
	private String filePath;

	public FileReader() {
	}

	public FileReader(String path) {
		this.filePath = path;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String path) {
		this.filePath = path;
	}	
}
