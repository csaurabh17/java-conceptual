package interfaces;

import java.util.function.BiConsumer;

public class FI_BiConsumer {

	public static void main(String[] args) {
		getBiConsumer(4, 2);
	}

	private static void getBiConsumer(int i, int j) {
		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
		biConsumer.accept(i, j);
	}

}
