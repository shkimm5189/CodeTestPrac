//문제 설명
//함수 solution은 정수 n을 매개변수로 입력받습니다. 
//n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
//예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//제한 조건
//n은 1이상 8000000000 이하인 자연수입니다.

package 정수내림차순정렬;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public static long solution(long n) {
	
		String str = String.valueOf(n);
		String[] sr = str.split("");
			
		Arrays.sort(sr,Comparator.reverseOrder());
		
		str = String.join("", sr);
		long answer = Long.parseLong(str);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(5544321));
	}
}

