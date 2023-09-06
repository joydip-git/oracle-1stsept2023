package com.java.classobjectdemo.ui;

import java.util.Scanner;

import com.java.classobjectdemo.entities.*;

public class App {

	/*
	 * static void printSalarySlip(Developer developer) {
	 * System.out.println(developer.calculateSalary()); }
	 * 
	 * static void printSalarySlip(Hr hr) {
	 * System.out.println(hr.calculateSalary()); }
	 */
	static void printSalarySlip(Employee employee) {
		System.out.println(employee.calculateSalary());
		/*
		 * if(employee instanceof Developer) { Developer developer = (Developer)
		 * employee; System.out.println(developer.calculateDeveloperSalary()); }
		 * if(employee instanceof Hr) { Hr hr = (Hr) employee;
		 * System.out.println(hr.calculateHrSalary()); }
		 */
	}

	public static void main(String[] args) {
		Employee anilDeveloper = null;
		anilDeveloper = new Developer("anil", 1, 1000, 2000, 3000, 4000);

		Employee sunilHr = null;
		sunilHr = new Hr("sunil", 2, 2000, 3000, 4000, 5000);

		printSalarySlip(anilDeveloper);
		printSalarySlip(sunilHr);

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * Customer[] customersArrayObjectReference = new Customer[2]; for (int i = 0; i
		 * < 2; i++) { Customer customerObjectReference = acceptInputFromUser(scanner);
		 * customersArrayObjectReference[i] = customerObjectReference; }
		 * 
		 * scanner.close();
		 */
	}

	static Customer acceptInputFromUser(Scanner scanner) {
		System.out.println("enter name: ");
		String name = scanner.next();

		System.out.println("enter mobile no: ");
		long mobile = scanner.nextLong();

		System.out.println("enter email id: ");
		String email = scanner.next();

		System.out.println("enter door no: ");
		int doorNo = scanner.nextInt();

		System.out.println("enter street: ");
		String street = scanner.next();

		System.out.println("enter locality: ");
		String locality = scanner.next();

		System.out.println("enter city: ");
		String city = scanner.next();

		Customer customerRef = null;
		customerRef = new Customer(name, email, mobile, doorNo, street, locality, city);
		return customerRef;
	}
}
