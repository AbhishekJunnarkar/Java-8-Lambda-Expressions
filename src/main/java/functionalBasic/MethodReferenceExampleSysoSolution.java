package main.java.functionalBasic;

import java.util.Comparator;
import java.util.List;

//:: Operator for Method reference
public class MethodReferenceExampleSysoSolution {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 6, 15, 4, 65, 1, 3, 4, 6, 2, 7);

		methodReferenceExampleSysoSolution(numbers);
		methodReferenceExampleOrderdSysoSolution(numbers);
		methodReferenceExampleDistinctSysoSolution(numbers);
		methodReferenceExampleComparatorNaturalOrderToSortStreams(numbers);
		methodReferenceExampleComparatorReverseOrderToSortStreams(numbers);
	}

	private static void methodReferenceExampleSysoSolution(List<Integer> numbers) {
		System.out.println("\nPrint All Numbers In Functional Way Simplified with SYSO" + "");
		numbers.stream().map(number -> number + " ").forEach(System.out::print);// Method reference
	}

	private static void methodReferenceExampleOrderdSysoSolution(List<Integer> numbers) {
		System.out.println("\nPrint All Numbers ordered In Functional Way");
		numbers.stream().sorted().map(number -> number + " ").forEachOrdered(System.out::print);// Method reference
	}

	private static void methodReferenceExampleDistinctSysoSolution(List<Integer> numbers) {
		System.out.println("\nPrint All Numbers ordered and distinct In Functional Way");
		numbers.stream().sorted().map(number -> number + " ").distinct().forEachOrdered(System.out::print);// Method
	}
	
	private static void methodReferenceExampleComparatorNaturalOrderToSortStreams(List<Integer> numbers) {
		System.out.println("\nmethod Reference Example Comparator Natural order To Sort Streams");
		numbers.stream().sorted(Comparator.naturalOrder()).map(number -> number + " ").distinct().forEachOrdered(System.out::print);// Method
	}

	private static void methodReferenceExampleComparatorReverseOrderToSortStreams(List<Integer> numbers) {
		System.out.println("\nmethod Reference Example Comparator Reverse Order To Sort Streams");
		numbers.stream().sorted(Comparator.reverseOrder()).map(number -> number + " ").distinct().forEachOrdered(System.out::print);// Method
	}
}
