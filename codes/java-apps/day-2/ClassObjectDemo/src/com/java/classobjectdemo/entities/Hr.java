package com.java.classobjectdemo.entities;

public class Hr extends Employee {
	private double gratuityPayment;

	public Hr() {
		System.out.println("Developer default ctor");
	}

	public Hr(String name, int id, double basicPayment, double daPayment, double hraPayment, double gratuity) {
		super(name, id, basicPayment, daPayment, hraPayment);
		gratuityPayment = gratuity;
		System.out.println("Developer parameterized ctor");
	}

	public double getGratuityPayment() {
		return gratuityPayment;
	}

	public void setGratuityPayment(double gratuityPayment) {
		this.gratuityPayment = gratuityPayment;
	}

	/*public double calculateHrSalary() {
		return super.calculateSalary() + gratuityPayment;
	}*/
	@Override
	public double calculateSalary() {
		return super.calculateSalary() + gratuityPayment;
	}
}
