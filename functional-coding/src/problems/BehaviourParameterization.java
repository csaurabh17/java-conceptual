package problems;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviourParameterization {

	public static void main(String[] args) {
		printSumOfCubes(List.of(1,2,3));
	}
	
	private static void printSumOfCubes(List<Integer> nums) {
		Function<Integer,Integer> mapper = n -> n*n*n;
		Function<Integer,Integer> mapper2 = n -> n*n;
		collectAndPrint(nums, mapper);
		collectAndPrint(nums, mapper2);
	}

	private static void collectAndPrint(List<Integer> nums, Function<Integer, Integer> mapper) {
		System.out.println(nums.stream()
			.map(mapper)
			.collect(Collectors.toList()));
	}

}
