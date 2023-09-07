package com.java.ui;

import java.util.ArrayList;
import java.util.List;

public class App {

	// type parameter => TInput
	static <E> void add(E a, E b) {
		// System.out.println(a + b);
	}

	static <T1, T2, T3> void add(T1 a, T2 b, T3 c) {

	}

	public static void main(String[] args) {
		add(12, 13);
		add(12.34f, 12.45f);
		add("joydip", "mondal");
		add(12, 13, 45);// T1=T2=T3
		add(12.34f, 34.56, 13);

		Calculation<Integer, Integer> calcInteger = new Calculation<Integer, Integer>();
		Calculation<Float, Float> calcFloat = new Calculation<Float, Float>();
		// Calculation<String, String> calcString = new Calculation<String, String>();
		invokeCalculationMethods(calcInteger);
		invokeCalculationMethods(calcFloat);
		// invokeCalculationMethods(calcString);
	}

	// upper-bound wild-card
	static void invokeCalculationMethods(ICalculation<? extends Number, ? extends Number> calculation) {

	}
	// unbound wild-card
//	static void invokeCalculationMethods(ICalculation<?, ?> calculation) {
//
//	}

	// lower-bound wild-card
//	static void invokeCalculationMethods(ICalculation<? super Integer, ? super Integer> calculation) {
//
//	}

	static void showGenericsImplementationInList() {
		/*
		 * int[] numbers = new int[3]; numbers[0] = 10; numbers[1] = 20; numbers[2] =
		 * 30;
		 * 
		 * int[] copyOfNumbers = new int[6]; copyOfNumbers[0] = numbers[0];
		 * copyOfNumbers[1] = numbers[1]; copyOfNumbers[2] = numbers[2];
		 * 
		 * Integer x = 100; Object objX = x; //boxing Object objY = 12.34f;
		 */

		List<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(100);
		listOfNumbers.add(12);
		listOfNumbers.add(21);

		for (Integer numberValue : listOfNumbers) {
			System.out.println(numberValue);
		}

		/*
		 * Integer x = 100; // boxing: up-casting any type into Object type Object objX
		 * = x; //un-boxing:down-casting the value stored Object type into appropriate
		 * child type Integer xValue = (Integer) objX;
		 */
	}

}
