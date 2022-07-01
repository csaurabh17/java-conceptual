package interfaces;

import java.util.function.BiPredicate;

public class FI_BiPredicate {

	public static void main(String[] args) {
		getBiPredicate(4, 2);
	}

	private static void getBiPredicate(int i, int j) {
		BiPredicate<Integer,Integer> biPredicate = (a,b) -> a % b == 0;
		
		System.out.println(biPredicate.test(i, j));
		
	}

}
