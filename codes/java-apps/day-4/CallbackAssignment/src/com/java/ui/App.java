package com.java.ui;

import java.util.function.BiFunction;
import java.util.function.Function;

import com.java.businesslogic.Calculation;
import com.java.delegates.CalculationDelegate;

public class App {

	public static void main(String[] args) {
		Calculation calculation = new Calculation();

		// passing reference of an instance method
		// CalculationDelegate<Integer, Integer> operationAdd = calculation::add;
		BiFunction<Integer, Integer, Integer> operationAdd = calculation::add;

		// passing reference of a static method
		// CalculationDelegate<Integer, Integer> operationSubtract =
		// Calculation::subtract;
		BiFunction<Integer, Integer, Integer> operationSubtract = Calculation::subtract;

		// anonymous class
		BiFunction<Long, Long, Long> operationMultiply = new BiFunction<Long, Long, Long>() {

			@Override
			public Long apply(Long t, Long u) {
				return t * u;
			}
		};
		/*
		 * CalculationDelegate<Long, Long> operationMultiply = new
		 * CalculationDelegate<Long, Long>() {
		 * 
		 * @Override public Long invoke(Long firstValue, Long secondValue) { return
		 * firstValue * secondValue; }
		 * 
		 * }; // class ???? implements CalculationDelegate<Long,Long> { @override public
		 * Long // invoke(Long a Long b}{return a*b; }} // ??? cls = new ???(); //
		 * CalculationDelegate<Long, Long> operationMultiply = cls::invoke;
		 * 
		 */

		// CalculationDelegate<Long, Long> operationDivide = (firstValue, secondValue)
		// -> {
		// return firstValue / secondValue;
		// };
//		CalculationDelegate<Long, Long> operationDivide = (firstValue, secondValue) -> firstValue / secondValue;
		BiFunction<Long, Long, Long> operationDivide = (firstValue, secondValue) -> firstValue / secondValue;

		int resultAdd = calculate(operationAdd, 12, 13);
		int resultSubtract = calculate(operationSubtract, 12, 3);
		Long resultMultiply = calculate(operationMultiply, 12L, 3L);
		Long resultDivide = calculate(operationDivide, 12L, 3L);

		System.out.println(resultAdd);
		System.out.println(resultSubtract);
		System.out.println(resultMultiply);
		System.out.println(resultDivide);
	}

	// variable number of arguments (varargs)
	// static <E extends Number, R> R calculate(CalculationDelegate<E, R>
	// calculationOperation, E first, E second)
	static <E extends Number, U extends Number, R> R calculate(BiFunction<E, U, R> calculationOperation, E first,
			U second) {
		// invoking the actual operation via the interface method
		// return calculationOperation.invoke(first, second);
		return calculationOperation.apply(first, second);
	}
}
