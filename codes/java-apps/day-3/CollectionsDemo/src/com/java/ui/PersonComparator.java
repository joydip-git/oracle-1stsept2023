package com.java.ui;

import java.util.Comparator;

//externalization of comparison logic

//Comparator<T> => int compare(T o1, T o2)
public class PersonComparator implements Comparator<Person> {

	private int sortChoice;

	public PersonComparator(int choice) {
		this.sortChoice = choice;
	}

	public void setSortChoice(int choice) {
		this.sortChoice = choice;
	}

	public int getSortChoice() {
		return this.sortChoice;
	}

	@Override
	public int compare(Person o1, Person o2) {
		Integer compResult = null;
		switch (sortChoice) {
		case 1:
			compResult = o1.getId() - o2.getId();
			break;

		case 2:
			compResult = o1.getName().compareTo(o2.getName());
			break;

		default:
			compResult = o1.getId() - o2.getId();
			break;
		}
		return compResult.intValue();
	}
}
