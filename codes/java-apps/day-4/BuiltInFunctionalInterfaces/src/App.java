import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {

//		Consumer<String> print = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		};
		Consumer<String> print = (value) -> System.out.println(value);
		print.accept("welcome to callback");

//		BiConsumer<String, String> concatenate = new BiConsumer<String, String>() {
//
//			@Override
//			public void accept(String arg0, String arg1) {
//				System.out.println(arg0 + " " + arg1);
//			}
//		};

		BiConsumer<String, String> concatenate = (firstName, lastName) -> {
			System.out.println(firstName + " " + lastName);
		};
		concatenate.accept("Kuldeep", "Soni");

//		Function<Integer, Boolean> evenFinder = new Function<Integer, Boolean>() {
//
//			@Override
//			public Boolean apply(Integer t) {
//				return t % 2 == 0;
//			}
//		};
		Function<Integer, Boolean> evenFinder = (num) -> num % 2 == 0;
		System.out.println(evenFinder.apply(12));

//		Function<Integer, Integer> squareAreaCalculator = new Function<Integer, Integer>() {
//
//			@Override
//			public Integer apply(Integer t) {
//				return t * t;
//			}
//		};
		Function<Integer, Integer> squareAreaCalculator = (t) -> t * t;
		System.out.println(squareAreaCalculator.apply(12));

//		BiFunction<Integer, Integer, Integer> add = new BiFunction<Integer, Integer, Integer>() {
//
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				return t + u;
//			}
//		};

		BiFunction<Integer, Integer, Integer> add = (Integer t, Integer u) -> t + u;
		System.out.println(add.apply(12, 20));

//		Predicate<Integer> oddFinder = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				return t % 2 != 0;
//			}
//		};
		Predicate<Integer> oddFinder = (Integer t) -> {
			return t % 2 != 0;
		};
		System.out.println(oddFinder.test(12));

//		BiPredicate<Integer, Integer> greater = new BiPredicate<Integer, Integer>() {
//
//			@Override
//			public boolean test(Integer t, Integer u) {
//				return t > u;
//			}
//		};
		BiPredicate<Integer, Integer> greater = (Integer t, Integer u) -> {
			return t > u;
		};
		System.out.println(greater.test(2, 3) ? "2 is greater" : "3 is greater");
	}
}
