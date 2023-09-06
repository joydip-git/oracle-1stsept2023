package com.java.utilities;
import java.util.Scanner;
import com.java.businesslogic.Calculation;

//final (not-inheritable utility class)
public final class UiUtility {

	public static void printMenu() {
		System.out.println("---MENU----");
		System.out.println("1. Add(+)");
		System.out.println("2. Subtract(-)");
		System.out.println("3. Multiply(*)");
		System.out.println("4. Divide(/)");
		System.out.println("5. Exit(e)");
	}

	public static char getChoiceFromUser(Scanner sc) {
		System.out.println("\nEnter Choice[+ - * / e]: ");
		char choice = sc.next().charAt(0);
		return choice;
	}

	public static int getNumberFromUser(Scanner sc) {
		System.out.println("\nEnter a number(non-fractional): ");
		int choice = sc.nextInt();
		return choice;
	}

	public static char getContinutationChoice(Scanner sc) {
		System.out.println("Continue?[y/Y/n/N]: ");
		char choice = sc.next().charAt(0);
		return convertToLowerCase(choice);
	}

	public static char convertToLowerCase(char characterValue) {
		if (Character.isUpperCase(characterValue))
			return Character.toLowerCase(characterValue);
		else
			return characterValue;
	}

	public static int calculate(int choice, int first, int second) {
		Calculation calculation = new Calculation();
		int result = 0;
		switch (choice) {
		case '+':
			result = calculation.add(first, second);
			break;

		case '-':
			result = calculation.subtract(first, second);
			break;

		case '*':
			result = calculation.multiply(first, second);
			break;

		case '/':
			result = calculation.divide(first, second);
			break;

		default:
			result = 0;
			break;
		}
		return result;
	}

	public static void logException(Exception e) {
		System.out.println("Error Message: " + e.getMessage());
		e.printStackTrace();
	}
}
