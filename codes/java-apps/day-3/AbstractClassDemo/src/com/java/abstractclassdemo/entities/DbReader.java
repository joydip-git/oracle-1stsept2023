package com.java.abstractclassdemo.entities;

public class DbReader implements DataAccess{
	
	private String dbConnectionString;
	
	public DbReader() {
	}
	
	
	public DbReader(String dbConnectionString) {
		super();
		this.dbConnectionString = dbConnectionString;
	}


	public String getDbConnectionString() {
		return dbConnectionString;
	}


	public void setDbConnectionString(String dbConnectionString) {
		this.dbConnectionString = dbConnectionString;
	}


	@Override
	public String readData() {
		return "data from database";
	}

	@Override
	public void writeData() {
	}
}
