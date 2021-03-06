package b9251_LCS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * LCS 1번 문제
 */
public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strOne = br.readLine();
		String strTwo = br.readLine();
		
		// 0번째 인덱스의 추가
		int[][] dp = new int[strOne.length()+1][strTwo.length()+1];
		for(int i = 1 ; i <=strOne.length() ; i++) {
			for(int j = 1 ; j <= strTwo.length(); j++) {
				//요소가 같으면 대각선 위의 숫자의 +1
				if(strOne.charAt(i-1) == strTwo.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
					
				//요소가 다르다면 위와 옆에 있는 값중 최솟값 
				} else {

					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		
		
		System.out.println(dp[strOne.length()][strTwo.length()]);
		
	}
}
