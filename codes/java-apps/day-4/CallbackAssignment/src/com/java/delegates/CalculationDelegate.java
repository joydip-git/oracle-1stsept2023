package com.java.delegates;

@FunctionalInterface
public interface CalculationDelegate<E extends Number, R> {
	//int invoke(int firstValue, int secondValue);
	R invoke(E firstValue, E secondValue);
}

//@FunctionalInterface
//public interface BiFunction<T,U,R>{ R apply(T a, U b); }
