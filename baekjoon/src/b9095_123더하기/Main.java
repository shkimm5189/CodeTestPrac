package b9095_123더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 각 1,2,3에 대해 경우의 수를 구하는 방식으로 풀면된다
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		while(N-- > 0 ) {
			int targetNum = Integer.parseInt(br.readLine());
			for(int i =4 ; i <= targetNum; i++) {
				dp[i] = dp[i-1] + dp[i-2] +dp[i-3];
			}
			System.out.println(dp[targetNum]);
		}
		
		
	}

}
