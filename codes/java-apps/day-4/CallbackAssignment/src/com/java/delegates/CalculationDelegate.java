package com.java.delegates;

@FunctionalInterface
public interface CalculationDelegate {
	int invoke(int firstValue, int secondValue);
}
