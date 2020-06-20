package main.java.functionalBasic;

import java.util.List;

public class PlayWithNumbersStructured2FunctionalNumericOperations {

	public static void main(String[] args) {

		printAllNumbersInStructuredWay(List.of(12, 6, 15, 4, 65, 1, 3, 4, 6, 2, 7));

		printAllNumbersInFunctionalWay(List.of(12, 6, 15, 4, 65, 1, 3, 4, 6, 2, 7));

		printSquareOfEvenNumbersInFunctionalWay(List.of(12, 6, 15, 4, 65, 1, 3, 4, 6, 2, 7));

		printCubeOfOddNumbersInFunctionalWay(List.of(12, 6, 15, 4, 65, 1, 3, 4, 6, 2, 7));

	}

	private static void printCubeOfOddNumbersInFunctionalWay(List<Integer> numbers) {
		System.out.println("\nPrint Cube Of Odd Numbers In Functional Way");
		numbers.stream().filter(number -> number % 2 == 1).map(number -> number * number * number).sorted()
				.forEach(System.out::println);
	}

	private static void printSquareOfEvenNumbersInFunctionalWay(List<Integer> numbers) {
		System.out.println("\nPrint sorted Square of all Even number in a Functional way ");
		numbers.stream().filter(number -> number % 2 == 0).map(number -> number * number)
		.distinct().sorted()
		.map(number -> number.toString() + " ")
		
				.forEach(System.out::println);

	}

	private static void printAllNumbersInStructuredWay(List<Integer> numbers) {
		System.out.println("Print All Numbers In Structured Way ");
		// Loop over the numbers
		for (int number : numbers) {
			System.out.print(number);
		}
	}

	private static void printAllNumbersInFunctionalWay(List<Integer> numbers) {
		System.out.println("\nPrint All Numbers In Functional Way");
		// What to do?
		numbers.stream().sorted().forEach(System.out::print);// Method reference

	}

}
