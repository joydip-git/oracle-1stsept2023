package com.java.abstractclassdemo.entities;

public class XmlFileReader extends FileReader{
	public XmlFileReader() {
	}
	
	public XmlFileReader(String path) {
		super(path);
	}

	@Override
	public String readData() {
		return "data from XML file";
	}

	@Override
	public void writeData() {
	}
}
