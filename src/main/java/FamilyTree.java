package main.java;

import java.util.List;

//:: Operator for Method reference
public class FamilyTree {

	public static void main(String[] args) {

		List<String> members = List.of("Priyanka", "Abhishek", "Arnav", "Aarna", "Sandhya", "Chandrakant", "Pradeep",
				"Prerana", "Slimy");

		printFamilyTree(members);

		printFamilyMembersNameStartingWithA(members);

		printFamilyMembersNameHaving5Characters(members);
	}

	private static void printFamilyMembersNameHaving5Characters(List<String> members) {
		System.out.println("Print all members having 5 characters in name");
		members.stream().filter(member -> member.length() <= 5).sorted().forEach(System.out::println);

	}

	private static void printFamilyMembersNameStartingWithA(List<String> members) {
		System.out.println("Print all members starting with A");

		members.stream().filter(member -> member.contains("A")).sorted().forEach(System.out::println);

	}

	private static void printFamilyTree(List<String> members) {

		System.out.println("Print all members ");
		members.stream().sorted().forEach(System.out::println);

	}

}
