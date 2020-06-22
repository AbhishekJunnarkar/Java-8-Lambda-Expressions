package main.java.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<Integer> unaryOperator = x -> x *3;
		System.out.println(unaryOperator.apply(10));
	}
}
