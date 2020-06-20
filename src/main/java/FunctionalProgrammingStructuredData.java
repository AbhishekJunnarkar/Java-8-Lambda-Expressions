package main.java;

import java.util.List;

public class FunctionalProgrammingStructuredData {

	public static void main(String[] args) {

		printAllNumbersInStructuredWay(List.of(12, 6, 15, 4, 65, 1, 3, 4, 6, 2, 7));

		printAllNumbersInFunctionalWay(List.of(12, 6, 15, 4, 65, 1, 3, 4, 6, 2, 7));

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
		numbers.stream().forEach(FunctionalProgrammingStructuredData::print);// Method reference

	}

	private static void print(int number) {
		System.out.print(number);
	}

}
