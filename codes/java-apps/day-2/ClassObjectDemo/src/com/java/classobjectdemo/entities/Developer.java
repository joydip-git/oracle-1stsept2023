package com.java.classobjectdemo.entities;

public class Developer extends Employee {

	private double incentivePayment;

	public Developer() {
		System.out.println("Developer default ctor");
	}

	public Developer(String name, int id, double basicPayment, double daPayment, double hraPayment, double incentive) {
		super(name, id, basicPayment, daPayment, hraPayment);
		incentivePayment = incentive;
		System.out.println("Developer parameterized ctor");
	}

	public double getIncentivePayment() {
		return incentivePayment;
	}

	public void setIncentivePayment(double incentivePayment) {
		this.incentivePayment = incentivePayment;
	}

	/*public double calculateDeveloperSalary() {
		return super.calculateSalary() + incentivePayment;
	}*/
	
	@Override
	public double calculateSalary() {
		return super.calculateSalary() + incentivePayment;
	}
}
