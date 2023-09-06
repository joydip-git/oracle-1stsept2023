package com.java.userinterface;

import java.util.Scanner;
import com.java.utilities.UiUtility;

public class App {

	public static void main(String[] args) {
		Scanner scanner = null;
		char toContinue = 'n';
		try {
			scanner = new Scanner(System.in);
			do {
				UiUtility.printMenu();
				char calculationChoice = UiUtility.getChoiceFromUser(scanner);
				if (calculationChoice == 'e')
					break;

				int firstValue = UiUtility.getNumberFromUser(scanner);
				int secondValue = UiUtility.getNumberFromUser(scanner);
				
				int calculationResult = UiUtility.calculate(calculationChoice, firstValue, secondValue);
				System.out.println("Result: " + calculationResult);

				toContinue = UiUtility.getContinutationChoice(scanner);

			} while (toContinue != 'n' && toContinue == 'y');
		} catch (Exception e) {
			UiUtility.logException(e);
		} finally {
			if (scanner != null)
				scanner.close();
		}
	}	
}
