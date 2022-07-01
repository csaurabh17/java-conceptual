package problems;

import java.util.List;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSumOfNumbers(List.of(1,2,3,4));
	}

	private static void printSumOfNumbers(List<Integer> nums) {
		System.out.print(nums.stream()
			.reduce(0, (a,b) -> a + b));
			
		
	}

}
