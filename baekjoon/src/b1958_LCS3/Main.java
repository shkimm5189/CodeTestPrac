package b1958_LCS3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * LCS 3 문자열 3가지 비교하기
 * 
 * 
		abcdefghijklmn
		bdefg
		efg
		
		3
 */
public class Main {

	
	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String strOne = br.readLine();
		String strTwo = br.readLine();
		String strThr = br.readLine();
		
		
		String s = getLCS(strOne,strTwo);
		System.out.println(getLCS(s,strThr).length());
		
		
		
		
		
	}
	static String getLCS(String strOne ,String strTwo) {
		int dp[][] = new int[strOne.length()+1][strTwo.length()+1];
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i <= strOne.length(); i++) {
			for(int j = 1 ; j <= strTwo.length(); j++ ) {
				if(strOne.charAt(i-1) == strTwo.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] +1;
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);			
				}
			}
		}
		int oneLen = strOne.length();
		int twoLen = strTwo.length();
		while(!(oneLen == 0 || twoLen == 0)) {
			if(strOne.charAt(oneLen-1 ) == strTwo.charAt(twoLen-1)) {
				sb.append(strOne.charAt(oneLen-1));
				oneLen--;
				twoLen--;
			} else if( dp[oneLen][twoLen] == dp[oneLen-1][twoLen]) {
				oneLen--;
			} else if( dp[oneLen][twoLen] == dp[oneLen][twoLen-1]) {
				twoLen--;
			}
		}
		return sb.reverse().toString();
	}
}
