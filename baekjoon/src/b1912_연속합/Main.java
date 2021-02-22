package b1912_연속합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] dp;


	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int repeat = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		dp = new int[repeat+1];

		for(int i = 0 ; i < repeat; i++) {
			dp[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < repeat; i++) {
			int temp = dp[i];
			int max = temp;
			for(int j = i ; j < repeat ; j++) {
				temp += dp[j];
				max = Math.max(max, temp + dp[j]);
				
			}
			dp[i] = max;
		}
		Arrays.sort(dp);
		for(int i : dp) {
			System.out.println(i);
		}
	}
}
