package main.java.functionalBasic;

import java.util.List;

//:: Operator for Method reference
public class MethodReferencePrintSortFindEvenNumberOperations {

	public static void main(String[] args) {

		methodReferenceExample(List.of(12, 6, 15, 4, 65, 1, 3, 4, 6, 2, 7));

	}

	private static void methodReferenceExample(List<Integer> numbers) {
		System.out.println("\nPrint All Numbers In Functional Way");

		numbers.stream().forEach(System.out::println);// Method reference

		System.out.println("\nPrint All Numbers sorted In Functional Way");

		numbers.stream().sorted().forEachOrdered(System.out::println);// Method reference

		System.out.println("\nPrint All Even Numbers sorted In Functional Way");

		numbers.stream().filter(number -> number % 2 == 0).sorted().forEachOrdered(System.out::println);// Method
																										// reference

	}

}
