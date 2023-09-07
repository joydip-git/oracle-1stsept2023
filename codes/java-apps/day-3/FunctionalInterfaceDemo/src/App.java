import java.util.List;
import java.util.ArrayList;

public class App {

	static List<Integer> filterValues(List<Integer> values, Logic logic) {
		List<Integer> result = new ArrayList<Integer>();
		for (Integer value : values) {
			// if (value % 2 != 0) {
			boolean isTrue = logic.apply(value);
			if (isTrue)
				result.add(value);
		}
		return result;
	}

	public static void main(String[] args) {
//		int x = 10;
//		int* address = &x;
		// address++;

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(8);
		numbers.add(5);
		numbers.add(6);
		numbers.add(3);
		numbers.add(1);
		numbers.add(2);

		
		// the name of the method is acting as a reference to a method
		// how to reference a method:
		// 1. you should have a Functional Interface (an interface with exactly one
		// method)
		// 2. you should some method (in a class) whose signature is same as that of the
		// method in the functional interface
		// signature: return type of the method and number, data type, position of the
		// arguments of the method
		// 3. declare a variable of that functional interface and pass the name of the
		// function/method from the class
		// 3.a. if the method is non-static/instance method then you have to create an
		// object of that class and then pass the reference of the method by mentioning
		// the name of the method
		// the syntax is
		// Funtional-Interface-name variable-name = object-reference::method-name

		// 3.b. if the method is static method then you don't have to create an object
		// of that class. Just mention the name of the class and then pass the reference
		// of the method by mentioning the name of the method
		// the syntax is
		// Funtional-Interface-name variable-name = class-name::method-name

		LogicImplementation logicImplObject = new LogicImplementation();
		//logicImplObject.isEven(12);
		//LogicImplementation.isOdd(12);
		
		//Logic evenLogic = logicImplObject::isEven;
		Logic oddLogic = LogicImplementation::isOdd;
		//Logic greaterLogic = logicImplObject::isGreaterThanFour;

		List<Integer> filteredList = filterValues(numbers, oddLogic);
		
		for (Integer value : filteredList) {
			System.out.println(value);
		}
	}
}
