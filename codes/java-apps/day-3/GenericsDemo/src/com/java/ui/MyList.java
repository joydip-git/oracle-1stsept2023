package com.java.ui;

public interface IList<T>{
	void add(T data);
}
public class MyList<T extends Number> implements IList<T>{
	public void add(T data) {

	}
}
