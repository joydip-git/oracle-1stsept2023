package com.java.ui;

import java.util.*;

public class App {

	public static void main(String[] args) {
		personListDemo();
	}

	static void personListDemo() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("joydip", 3));
		people.add(new Person("sunil", 1));
		people.add(new Person("anil", 2));
		
		//people.get(0).compareTo(people.get(1));
		
		for (Person person : people) {
			System.out.println(person.getName() + " " + person.getId());
		}
		System.out.println("1. sort by id");
		System.out.println("2. sort by name");
		System.out.print("enter choice[1/2]: ");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		
		System.out.println("\nafter sorting\n");
		//1. Person class must implement Comparable<T> interface and "int compareTo(T o)" method
		//Collections.sort(people);
		
		//2. Create a separate class and implement the Comparator<T> and "int compare(T o1, T o2)" method
		PersonComparator comparator = new PersonComparator(choice);
		//2.i.
		//Collections.sort(people, comparator);
		//void <TComapartor extends Comparator<T>> Sort(List<T> data, TComparator comparator) 
		
		//2.ii. use the sort method of the list and pass the comparator class object
		people.sort(comparator);
	
		/*
		for (int i = 0; i < people.size(); i++) {
			for (int j = i + 1; j < people.size(); j++) {
				//1.
				int compResult = people.get(i).compareTo(people.get(j));
				//2.
				//int compResult = comparator.compare(people.get(i), people.get(j)); 
				if (compResult > 0) {
					Person temp = people.get(i);
					people.set(i, people.get(j));
					people.set(j, temp);
				}
			}
		}
		*/
		for (Person person : people) {
			System.out.println(person.getName() + " " + person.getId());
		}
	}

	static void listDemo() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);// 1
		list.add(1);// 2
		list.add(13);// 3
		list.add(0, 40);// 0 //index <= number-of-elements-present-currently (3)
		// list.addAll(new ArrayList<Integer>());
		/*
		 * list.remove(1); Object val = 13; list.remove(val);
		 */

		for (Integer integer : list) {
			System.out.println(integer);
		}

		Collections.sort(list);
		// list.sort(new IntegerSorter());
		/*
		 * for (int i = 0; i < list.size(); i++) { for (int j = i + 1; j < list.size();
		 * j++) { if (list.get(i) - list.get(j) > 0) { // if (list.get(i) > list.get(j))
		 * { Integer temp = list.get(i); list.set(i, list.get(j)); list.set(j, temp); }
		 * } }
		 */

		System.out.println("\nafter sorting\n");
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
