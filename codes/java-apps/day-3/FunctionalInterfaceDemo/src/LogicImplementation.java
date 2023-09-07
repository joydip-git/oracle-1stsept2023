
/*public class LogicImplementation implements Logic {

	@Override
	public boolean apply(int numberValue) {
		return numberValue % 2 == 0 ? true : false;
	}
}*/

public class LogicImplementation {

	public boolean isEven(int num) {
		return num % 2 == 0 ? true : false;
	}

	public static boolean isOdd(int numberValue) {
		return numberValue % 2 != 0 ? true : false;
	}

	public boolean isGreaterThanFour(int numberValue) {
		return numberValue % 2 >= 4 ? true : false;
	}
}
