package programmers1;

public class Solution {
	public int[] solution(int money) {
		
		int[] bill = {50000,10000,5000,1000,500,100,50,10,1};
		int[] answer =new int[9];
		
		int sum = 0 ;
		int cnt =0 ;
		while(true) {
			if( money - bill[cnt] < 0 ) {
				cnt++;
			}else if( money - bill[cnt] > 0){
				money+=bill[cnt];
				answer[cnt]++;
			} else {
				answer[cnt]++;
				break;
			}
		}
		
		
		return answer;
	}
		
}
