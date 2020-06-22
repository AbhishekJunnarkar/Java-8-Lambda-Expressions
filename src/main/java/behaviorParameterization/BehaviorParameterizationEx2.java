package main.java.behaviorParameterization;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Passing the logic of the method or passing the behavior as argument
 * 
 * @author AI71PXd
 *
 */
public class BehaviorParameterizationEx2 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2, 5, 6, 7, 8, 9, 12);

		List<Integer> squaredNumbers = numericia(numbers, x -> x * x);
		System.out.println("Squared Numbers" + squaredNumbers);
		
		List<Integer> cubedNumbers = numericia(numbers, x -> x * x * x);
		System.out.println("Cubed Numbers" + cubedNumbers);
		
	}

	private static List<Integer> numericia(List<Integer> numbers, Function<? super Integer, ? extends Integer> mapper) {
		return numbers.stream().map(mapper).collect(Collectors.toList());
	}
}
