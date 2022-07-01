package problems;

import java.util.List;

public class PrintEvenNums {

	public static void main(String[] args) {
		// Structural
		printEvenNumbers(List.of(11,12,14,18,17,10,20));
		// Functional
		printEvenNumbersFunctional(List.of(11,12,14,18,17,10,20));
		
	}

	private static void printEvenNumbers(List<Integer> nums) {
		
		for(int num: nums) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		System.out.println("------------");
		
	}

	private static void printEvenNumbersFunctional(List<Integer> nums) {
		nums.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
	}

}
