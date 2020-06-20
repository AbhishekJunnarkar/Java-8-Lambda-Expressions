package main.java;

import java.util.List;

//:: Operator for Method reference
public class MethodReferenceExample {

	public static void main(String[] args) {

		methodReferenceExample(List.of(12, 6, 15, 4, 65, 1, 3, 4, 6, 2, 7));

	}

	private static void methodReferenceExample(List<Integer> numbers) {
		System.out.println("\nPrint All Numbers In Functional Way");
		// What to do?
		numbers.stream().forEach(MethodReferenceExample::print);// Method reference

		System.out.println("\nPrint All Numbers sorted In Functional Way");
		// What to do?
		numbers.stream().sorted().forEachOrdered(MethodReferenceExample::print);// Method reference

	}

	private static void print(int number) {
		System.out.print(number + " ");
	}

}
