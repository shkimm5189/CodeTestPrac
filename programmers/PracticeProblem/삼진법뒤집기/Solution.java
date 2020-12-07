//문제 설명
//자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//n은 1 이상 100,000,000 이하인 자연수입니다.

package 삼진법뒤집기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.Stack;

public class Solution {
	public int solution(int n) {
		Stack<Integer> st = new Stack<Integer>();
		List<Integer> list = new ArrayList<>();
		int answer = 0;
		String s= "asd";
				while( n > 0) {
			st.push(n%3);
			n /= 3;
		}
			
		
		while ( !st.isEmpty() ) {
			int pow = 0;
			list.add(st.pop() * ((int) Math.pow(3 , pow++)));
		}
		
		for(int i =0 ; i < list.size(); i++) {
			answer += list.get(i);
		}
		
		return answer;
		
	}
	
}

