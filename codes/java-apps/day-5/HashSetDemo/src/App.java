import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		// setDemo();
		// equalityDemo();
		setOfReferences();
	}

	static void hashDemo() {
		Person anilPerson = new Person(1, "anil", 1000);
		Person sunilPerson = new Person(1, "anil", 1000);
		System.out.println(anilPerson.hashCode());
		System.out.println(sunilPerson.hashCode());

		if (anilPerson.hashCode() == sunilPerson.hashCode()) {
			System.out.println("same object");
		} else
			System.out.println("different object");
	}

	static void equalityDemo() {
		Person anilPerson = new Person(1, "anil", 1000);
		Person sunilPerson = new Person(2, "sunil", 1000);
		try {
			if (anilPerson.equals(sunilPerson)) {
				System.out.println("same object");
			} else
				System.out.println("different object");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidParameterException e) {
			e.printStackTrace();
		}
	}

	static void setDemo() {
		HashSet<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(1);
		numberSet.add(0);
		numberSet.add(3);
		numberSet.add(1);

		for (Integer value : numberSet) {
			System.out.println(value);
		}

		numberSet.remove(0);
		System.out.println("\nafter deletion\n");
		Iterator<Integer> setIterator = numberSet.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
	}

	static void setOfReferences() {
		Person anilPerson = new Person(1, "anil", 1000);
		// Person sunilPerson = anilPerson;
		Person sunilPerson = new Person(2, "anil", 1000);

		HashSet<Person> peopleSet = new HashSet<Person>();
		// anilPerson.equals(sunilPerson);

		peopleSet.add(anilPerson); // 386662400
		peopleSet.add(sunilPerson);// 386662400

		for (Person person : peopleSet) {
			System.out.println(person);
		}
	}
}
