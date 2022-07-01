package interfaces;

import java.util.function.BiFunction;

public class FI_BiFunction {

	public static void main(String[] args) {
		getBiFunction(2, 4);
	}

	private static void getBiFunction(int i, int j) {
		BiFunction<Integer, Integer, String> biFunction = (a, b) -> "Output -> " + (a * b);
		
		System.out.println(biFunction.apply(i, j));
	}

}
