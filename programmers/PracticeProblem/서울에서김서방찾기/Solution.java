//String형 배열 seoul의 element중 Kim의 위치 x를 찾아,
//김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요.
//seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

package 서울에서김서방찾기;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	public String solution(String[] seoul) {
		HashMap<String, Integer> hash = new HashMap<>() ;
		for(int i = 0 ; i < seoul.length; i++) {
			hash.put(seoul[i], i);
		}
		
		String answer = "김서방은 "+hash.get("Kim").toString()+"에 있다";
		return answer;
	}
}

