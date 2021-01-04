package kakaoIntern;

import java.util.HashMap;

public class Solution {
	public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{11,0,11}};
		HashMap<Integer, Integer> val = new HashMap<Integer, Integer>();
		val.put(1, 3);
		val.put(4, 2);
		val.put(7, 1);
		val.put(3, 3);
		val.put(6, 2);
		val.put(9, 1);
		val.put(2, 3);
		val.put(5, 2);
		val.put(8, 1);
		val.put(0, 0);
		
		int lHand = 0 ;
		int rHand = 0;
		for(int i = 0 ; i < numbers.length; i++) {
			if(numbers[i] == 1 | numbers[i] == 4 | numbers[i] == 7) {
				lHand = val.get(numbers[i]);
				sb.append("L");
			} else if(numbers[i] == 3 | numbers[i] == 6 | numbers[i] == 9) {
				rHand = val.get(numbers[i]);
				sb.append("R");
			} else {
				int cHand = val.get(numbers[i]);
				if( Math.abs(lHand - cHand) == Math.abs(rHand - cHand) ) {
					if( hand == "right" ) {
						rHand = val.get(numbers[i]);
						sb.append("R");
					} else {
						lHand = val.get(numbers[i]);
						sb.append("L");
					}
				} else if(Math.abs(lHand - cHand) < Math.abs(rHand - cHand)) {
					lHand = val.get(numbers[i]);
					sb.append("L");
				} else if(Math.abs(lHand - cHand) > Math.abs(rHand - cHand)) {
					rHand = val.get(numbers[i]);
					sb.append("R");
				}
			}
		}
		
		
		String answer = sb.toString();
		return answer;
	}
}
