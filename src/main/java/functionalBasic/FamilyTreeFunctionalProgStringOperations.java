package main.java.functionalBasic;

import java.util.Comparator;
import java.util.List;

//:: Operator for Method reference
public class FamilyTreeFunctionalProgStringOperations {

	public static void main(String[] args) {

		List<String> members = List.of("Priyanka", "Abhishek", "Arnav", "Aarna", "Sandhya", "Chandrakant", "Pradeep",
				"Prerana", "Slimy");

		printFamilyTreesortedNaturalOrder(members);

		printFamilyTreesortedSizeofCharsusingComparator(members);

		printFamilyMembersNameStartingWithA(members);

		printFamilyMembersNameHaving5Characters(members);

		printNumberofCharactersinEachName(members);
	}

	private static void printNumberofCharactersinEachName(List<String> members) {
		System.out.println("Print all members having 5 characters in name");
		members.stream().map(map -> map.length()).sorted().forEach(System.out::println);
	}

	private static void printFamilyMembersNameHaving5Characters(List<String> members) {
		System.out.println("Print all members having 5 characters in name");
		members.stream().filter(member -> member.length() <= 5).sorted().forEach(System.out::println);

	}

	private static void printFamilyMembersNameStartingWithA(List<String> members) {
		System.out.println("Print all members starting with A");

		members.stream().filter(member -> member.contains("A")).sorted().forEach(System.out::println);

	}

	private static void printFamilyTreesortedNaturalOrder(List<String> members) {

		System.out.println("Print all members sorted Natural Order");
		members.stream().sorted().forEach(System.out::println);

	}

	private static void printFamilyTreesortedSizeofCharsusingComparator(List<String> members) {

		System.out.println("Print all members sorted  by size of characters using comparator ");
		members.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);

	}

}
