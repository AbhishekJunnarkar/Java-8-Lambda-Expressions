package main.java.playingwithStreams;

import com.sun.tools.javac.util.List;

public class PlaywithNumericStreamsUsingStreams {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(2, 5, 6, 12, 3, 4, 7);

		addNumericsusingPredefinedFunctionAddOfIntegerClass(numbers);
		addNumericswithsumMethod(numbers);
		addNumericswithlambda(numbers);
		findGreatestEntity(numbers);
		squareEveryNumberAndFindSumOfSquares(numbers);
		cubeEveryNumberAndFindSumOfCubes(numbers);

	}

	private static void cubeEveryNumberAndFindSumOfCubes(List<Integer> numbers) {
		System.out.println("cube Every Number And Find Sum Of cubes");
		int sumofcubes = numbers.stream().map(number -> number * number * number).reduce(0, (x, y) -> x + y);
		System.out.println("cube Every Number And Find Sum Of cubes = " + sumofcubes);
	}

	private static void squareEveryNumberAndFindSumOfSquares(List<Integer> numbers) {
		System.out.println("square Every Number And Find Sum Of Squares");
		int sumofSquares = numbers.stream().map(number -> number * number).reduce(0, (x, y) -> x + y);
		System.out.println("square Every Number And Find Sum Of Squares = " + sumofSquares);
	}

	private static void findGreatestEntity(List<Integer> numbers) {
		int greatestNumber = numbers.stream().reduce(0, (x, y) -> x > y ? x : y);
		System.out.println("find Greatest Entity " + greatestNumber);
	}

	private static void addNumericswithlambda(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum using Add Numerics with lambda method is " + sum);

	}

	private static void addNumericsusingPredefinedFunctionAddOfIntegerClass(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum using Add Numerics method is " + sum);
	}

	private static void addNumericswithsumMethod(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, PlaywithNumericStreamsUsingStreams::sum);
		System.out.println("Sum using Add Numerics with Sum method is " + sum);
	}

	private static int sum(int aggregate, int nextNumber) {
		return aggregate + nextNumber;
	}
}
