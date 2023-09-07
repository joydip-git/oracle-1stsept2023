package com.java.abstractclassdemo.entities;

public class TextFileReader extends FileReader {
	
	public TextFileReader() {
	}
	
	public TextFileReader(String path) {
		super(path);
	}
	
	@Override
	public String readData() {
		return "data from text file";
	}
	
	@Override
	public void writeData() {
	}
}
