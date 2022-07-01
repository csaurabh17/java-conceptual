package problems;

import java.util.List;

public class CubeAndSum {

	public static void main(String[] args) {
		
		printSumOfCubes(List.of(1,2,3));
	}

	private static void printSumOfCubes(List<Integer> nums) {
		System.out.print(nums.stream()
			.map(n -> n*n*n)
			.reduce(0, (a,b)->a+b));
	}

}
