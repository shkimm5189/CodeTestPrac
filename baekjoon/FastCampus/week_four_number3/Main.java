package week_four_number3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
	public static List<Integer> variable = new ArrayList<Integer>();
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,4,5,7,8,9,2,3,6,7,10);
		
		for(Integer num : numbers) {
			deduplication(num);
		}
		
		Collections.sort(variable);
		
		System.out.println(variable);
		
		
	}
	private static void deduplication(Integer num) {
		if(!variable.contains(num)) variable.add(num);
	}
	
}
