package p2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static long[] solution(String s, String op) {
    	List<Long> list = new ArrayList<>();
    	
    	for(int i = 1 ; i < s.length(); i++) {
    		String temp = s;
    		long sub = Long.parseLong(temp.substring(0, i));
    		long mod = Long.parseLong(temp.substring(i));
    		
    		switch(op) {
    			case "+":
    				list.add(sub+mod);
    				break;
    			case "-":
    				list.add(sub-mod);
    				break;
    			case "*":
    				list.add(sub-mod);
    				break;
    		}
    		
    	}
    	
        long[] answer = new long[list.size()];
        for(int i = 0 ; i < answer.length; i++) {
        	answer[i] =list.get(i);
        }
        return answer;
    }
 
}