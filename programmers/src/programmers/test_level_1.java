package programmers;
//문제 설명
//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
//
//제한사항
//arr은 길이 1 이상, 100 이하인 배열입니다.
//arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
//
//자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
//
//조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
//예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
//
//자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
//
//제한 사항
//n은 1,000,000 이하의 자연수 입니다.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test_level_1 {
	public int[] solution(String msg) {
		List<Integer> list = new ArrayList<>();
		HashMap<String , Integer> hash = new HashMap<>();
		int cnt = 0 ;
		for(int i = 1 ; i <= 26; i++) {
			char c = 97;
			hash.put(Character.toString(c), i);
			c++;
		}
		int hashV = 27;
		
		while() {
			if()
		
			
		}
		int[] answer = {};
		
		
		return answer;
	}
}

//	
//	public static void main(String[] args) {
//		int[] coin = {100,10,1};
//		int[] count = {0,0,0};
//		int i = 0; 
//		boolean f = false;
//		int m = 352;
//		
//		while(i< 3) {
//			if( m < coin[i]) {
//				i++;
//			}else if(m > coin[i]){
//				m -= coin[i];
//				count[i]++;
//			} else {
//				f=true;
//				count[i]+=1;
//				break;
//			}
//		}
//		if(f) {
//			System.out.println(coin[0]+"원 갯수:"+count[0]+" "+coin[1]+"원 개수:"+count[1]+" "+coin[2]+"원 갯수:"+count[2]);
//		}else {
//			System.out.println("asd");
//		}
//	}
//}

//	  public double solution(int[] arr) {
//			double sum = 0;
//			for(int i = 0 ; i < arr.length; i++) {
//				sum+=arr[i];
//			}
//	        double answer = sum/arr.length;
//	        return answer;
//	    }
//}
