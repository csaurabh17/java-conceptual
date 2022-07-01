package problems;

import java.util.List;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		
		sumOfOddNums(List.of(1,2,3,4,5,6));
	}

	private static void sumOfOddNums(List<Integer> nums) {
		System.out.println(nums.stream()
			.filter(n -> n % 2 != 0)
			.reduce(0, (a,b) -> a + b));
		
	}

}
