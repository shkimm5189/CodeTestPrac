package number3;

public class Solution {
	public int solution(String name) {
		char startA = 'A';
		int cnt=0;
		int answer = 0;
		int rMove=0;
		int lMove=0;
		int minMove=0;
		for(int i = 0 ; i < name.length(); i++ ) {  // 알파벳A에서 해당 알파벳 까지 움직이는 최소횟수 구하기
			int min = 0;
			if(name.charAt(i) != 'A'){
				min = Math.abs('A'-name.charAt(i));
				if(min > Math.abs(('Z'+1)-name.charAt(i)) ) {
					min = Math.abs(('Z'+1)-name.charAt(i));
				}
				answer += min;
			}
		}
		minMove = name.length()-1;
		for(int i = 0 ; i < name.length();i++) {
			
		}
		

		return answer;
	}
}
