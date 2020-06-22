package main.java.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
			};
			System.out.println(randomIntegerSupplier.get());
	}

}
