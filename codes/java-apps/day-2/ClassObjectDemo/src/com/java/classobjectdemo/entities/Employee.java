package com.java.classobjectdemo.entities;

public class Employee {
	private String name;
	public static final String COMPANY_NAME = "Oracle";
	private int id;
	private double basicPayment;
	private double daPayment;
	private double hraPayment;

	public Employee() {
		System.out.println("Employee default ctor");
	}

	public Employee(String name, int id, double basicPayment, double daPayment, double hraPayment) {
		this.name = name;
		this.basicPayment = basicPayment;
		this.daPayment = daPayment;
		this.hraPayment = hraPayment;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public double getDaPayment() {
		return daPayment;
	}

	public void setDaPayment(double daPayment) {
		this.daPayment = daPayment;
	}

	public double getHraPayment() {
		return hraPayment;
	}

	public void setHraPayment(double hraPayment) {
		this.hraPayment = hraPayment;
	}

	public double calculateSalary() {
		return basicPayment + daPayment + hraPayment;
	}
}
