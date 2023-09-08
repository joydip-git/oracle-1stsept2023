package com.java.ui;

import com.java.businesslogic.Calculation;
import com.java.delegates.CalculationDelegate;

public class App {

	static int calculate(CalculationDelegate calculationOperation, int... values) {
		return calculationOperation.invoke(values[0], values[1]);
	}

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		CalculationDelegate operation = calculation::add;
		int result = calculate(operation, 12, 13);
		System.out.println(result);
	}
}
