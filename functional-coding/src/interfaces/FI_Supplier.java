package interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class FI_Supplier {

	public static void main(String[] args) {
		System.out.println(getSupplier());
	}

	private static Integer getSupplier() {
		Supplier<Integer> supplier = () -> {
		return new Random().nextInt(1000);
		};
		
		return supplier.get();

	}
}
