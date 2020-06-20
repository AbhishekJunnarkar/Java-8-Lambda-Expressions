package main.java;

import java.util.List;

//:: Operator for Method reference
public class MethodReferenceExampleSysoSolution {

	public static void main(String[] args) {

		methodReferenceExample(List.of(12, 6, 15, 4, 65, 1, 3, 4, 6, 2, 7));

	}

	private static void methodReferenceExample(List<Integer> numbers) {
		System.out.println("\nPrint All Numbers In Functional Way Simplified with SYSO"
				+ "");

		numbers.stream().forEach(System.out::print);// Method reference

		System.out.println("\nPrint All Numbers sorted In Functional Way");

		numbers.stream().sorted().forEachOrdered(System.out::print);// Method reference

	}

}
