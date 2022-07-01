package problems;

import java.util.List;

public class PrintContains {

	public static void main(String[] args) {
		
		printIfContains(List.of("asabhfk","bafasfa","cewtwt","eiowtuow"), "a");
	}

	private static void printIfContains(List<String> strs, String c) {
		
		strs.stream()
			.filter(s -> s.contains(c))
			.forEach(System.out::println);;
		
	}

}
