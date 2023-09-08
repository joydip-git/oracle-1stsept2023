package com.java.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

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

	static <E> List<Product> filterProducts(List<Product> products, BiPredicate<Product, E> filterLogic, E args) {
		List<Product> filteredList = new ArrayList<Product>();
		for (Product product : products) {
			if (filterLogic.test(product, args)) {
				filteredList.add(product);
			}
		}
		return filteredList;
	}

	public static void main(String[] args) {

		List<Product> productRecords = createListOfProducts();

		Scanner scanner = new Scanner(System.in);
		printMenu();
		int choice = getChoice(scanner);

		BiPredicate<Product, Object> filterByLogic = null;
		
		Object input = null;
		
		switch (choice) {
		case 1:
			filterByLogic = (Product p, Object searchText) -> p.getName().contains((String) searchText);
			System.out.println("\nenter product name to search for: ");
			input = scanner.next();
			break;

		case 2:
			filterByLogic = (Product p, Object price) -> p.getPrice() >= (float) price;
			System.out.println("\nenter product price to filter: ");
			input = scanner.nextFloat();
			break;

		default:
			break;
		}
		if (input != null && filterByLogic != null) {
			List<Product> filteredProducts = filterProducts(productRecords, filterByLogic, input);
			Consumer<Product> printProduct = (p) -> System.out.println(p);
			filteredProducts.forEach(printProduct);
		}
	}
}
