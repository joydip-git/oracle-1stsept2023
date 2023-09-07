package com.java.ui;

public class Person implements Comparable<Person> {
	private String name;
	private int id;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//internalization of comparison logic
	@Override
	public int compareTo(Person o) {
		return this.id - o.id;
	}
}
