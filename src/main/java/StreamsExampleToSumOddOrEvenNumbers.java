package main.java;

import java.util.Arrays;
import java.util.List;

public class StreamsExampleToSumOddOrEvenNumbers {

	public static void main(String[] args) {

		sumOfOddNumbersUsingStream();
		sumofEvenNumbersUsingStream();

	}

	private static void sumofEvenNumbersUsingStream() {
		List<Integer> numbers = Arrays.asList(12, 3, 5, 6, 8, 23, 9, 2);

		int sum = numbers.stream().filter(number -> (number % 2 == 0)).reduce(0, Integer::sum);
		System.out.println("sum of even numbers is " + sum);
	}

	private static void sumOfOddNumbersUsingStream() {

		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);// Create the list of integers

		int sum = numbers.stream() // Create Stream
				.filter(number -> (number % 2 != 0)) // Intermediate Operation
				.reduce(0, Integer::sum); // Terminal Operation

		System.out.println("sum of Odd numbers is " + sum);

	}

}
