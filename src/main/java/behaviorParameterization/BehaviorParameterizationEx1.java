package main.java.behaviorParameterization;

import java.util.List;
import java.util.function.Predicate;
/**
 * Passing the logic of the method or passing the behavior as argument
 * @author AI71PXd
 *
 */
public class BehaviorParameterizationEx1 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2, 5, 6, 7, 8, 9, 12);

		filterAndPrint(numbers, x -> x % 2 == 0);

		filterAndPrint(numbers, x -> x % 2 != 0);

	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}
}
