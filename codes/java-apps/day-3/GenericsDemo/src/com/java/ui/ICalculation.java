package com.java.ui;

//generic with constraint
public interface ICalculation<TInput, TResult> {
	TResult add(TInput a, TInput b);
	TResult Subtract(TInput a, TInput b);
	TResult Multiply(TInput a, TInput b);
	TResult Divide(TInput a, TInput b);
}
