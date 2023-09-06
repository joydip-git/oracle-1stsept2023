package com.java.classobjectdemo.ui;

import java.util.Scanner;

import com.java.classobjectdemo.entities.Customer;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Customer[] customersArrayObjectReference = new Customer[2];
		for (int i = 0; i < 2; i++) {
			Customer customerObjectReference = acceptInputFromUser(scanner);
			customersArrayObjectReference[i] = customerObjectReference;
		}

		scanner.close();
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
