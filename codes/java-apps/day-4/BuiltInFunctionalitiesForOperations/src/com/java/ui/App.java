package com.java.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.java.entities.Product;

public class App {

	static void printMenu() {
		System.out.println("1. filter by name");
		System.out.println("2. filter by price");
	}

	static int getChoice(Scanner scanner) {
		System.out.println("\nenter choice[1/2]: ");
		return scanner.nextInt();
	}

	static List<Product> createListOfProducts() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(4, "dell xps", 120000f, "new laptop from dell"));
		products.add(new Product(2, "hp envy", 100000f, "new laptop from hp"));
		products.add(new Product(3, "accer aspire 3", 110000f, "new laptop from accer"));
		products.add(new Product(1, "mac pro 3", 150000f, "new laptop from apple"));
		return products;
	}

	public static void main(String[] args) {
		List<Product> productRecords = createListOfProducts();

//		Scanner scanner = new Scanner(System.in);
//		printMenu();
//		int choice = getChoice(scanner);

//		Stream<Product> productStream = productRecords.stream();
//
//		Predicate<Product> filterByName = (Product p) -> p.getName().contains("e");
//		Predicate<Product> filterByPrice = (Product p) -> p.getPrice() >= 120000;
//		Stream<Product> filteredStream = productStream.filter(filterByPrice);
//		Consumer<Product> printProduct = (Product p)-> System.out.println(p.toString());
//		filteredStream.forEach(printProduct);

//		productRecords
//		.stream()
//		.sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
//		.filter((p)->p.getName().contains("e"))
//		.forEach((p)->System.out.println(p));

		productRecords
		.stream()
		.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
		.filter((p) -> p.getPrice() >= 120000)
		.forEach((p) -> System.out.println(p));

	}

}
