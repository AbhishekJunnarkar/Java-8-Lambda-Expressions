package main.java;

import java.util.Arrays;
import java.util.List;

public class BasicLambdaExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);

		int sum = numbers.stream() // Create Stream
				.filter(number -> (number % 2 != 0)) // Intermediate Operation
				.reduce(0, Integer::sum); // Terminal Operation
		
		System.out.println(sum);
	}
}
