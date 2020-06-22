package main.java.collectingStreamElements;

import java.util.stream.Collectors;

import java.util.List;

public class CollectionExampleforStream {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2, 5, 9, 23, 6, 98);
		List<Integer> squaredNumbers = squareList(numbers);
		System.out.println(squaredNumbers);
	}

	private static List<Integer> squareList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().map(number -> number * number).collect(Collectors.toList());

	}

}
