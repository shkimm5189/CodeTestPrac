package p2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Solution {
	public static String solution(String cyto) {
		Stack<String> st = new Stack<>();
		
		String[] str = cyto.split(""); 
	
		for(String s: str) {
			if(st.isEmpty()) {
				st.push(s);
			} else if(st.peek().equals(s)) {
				st.pop();
			} else {
				st.push(s);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < st.size(); i++) {
			sb.append(st.get(i));
		}
		String answer =sb.toString();
		return answer;
	}
	
};