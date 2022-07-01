package problems;

import java.util.List;

public class PrintListOfNumbers {

	public static void main(String[] args) {
//		printing via conventional structual code
//		printListStructural(List.of(1,2,3,4,5));
//		printing via functional programming
		printListFunctional(List.of(1,2,3,4,5));

	}

	private static void printListFunctional(List<Integer> of) {
		
		of.stream()
		  .forEach(System.out::println);

	}

	private static void printListStructural(List<Integer> nums) {
		
		for(int num : nums) {
			System.out.println(num);
		}
		
	}

}
