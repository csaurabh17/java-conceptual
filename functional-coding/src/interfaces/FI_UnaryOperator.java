package interfaces;

import java.util.function.UnaryOperator;

public class FI_UnaryOperator {

	public static void main(String[] args) {
		
		getUnaryOperator(3);
	}

	private static void getUnaryOperator(int i) {
		UnaryOperator<Integer> x = (a) -> a * a;
		System.out.println(x.apply(i));
		
	}

}
