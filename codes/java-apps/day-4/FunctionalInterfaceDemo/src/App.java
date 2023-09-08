import java.util.ArrayList;
import java.util.List;

public class App {

	static List<Integer> filterValues(List<Integer> list, LogicDelegate logicRef) {
		List<Integer> filteredList = new ArrayList<Integer>();
		for (Integer value : list) {
			// don't write the logic of filtration here
			// if (value % 2 == 0) {
			// filteredList.add(value);
			// }

			// rather pass the logic of filtration (i.e., a method containing the code for
			// filtration logic) here so that the logic can be applied on every value
			// present in the list
			boolean isTrue = logicRef.apply(value);
			if (isTrue) {
				filteredList.add(value);
			}
		}
		return filteredList;
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(3);
		numbers.add(7);
		numbers.add(4);
		numbers.add(6);

		Logic logic = new Logic();
		// System.out.println(logic.isEven(13));

		// isEven is a callback function referred by a functional interface
		LogicDelegate evenLogic = logic::isEven;
		// System.out.println(evenLogic.apply(12));

		LogicDelegate oddLogic = Logic::isOdd;

		List<Integer> result = filterValues(numbers, evenLogic);
		// List<Integer> result = filterValues(numbers, oddLogic);
		for (Integer value : result) {
			System.out.println(value);
		}

	}

}
