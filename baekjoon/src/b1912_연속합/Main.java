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
		dp = new int[repeat];
		int[] arr = new int[repeat];
		for(int i = 0 ; i < repeat; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = arr[0];
		int max = dp[0];
		
		for( int i = 1 ; i < dp.length; i++) {
			dp[i] = Math.max(dp[i-1] + arr[i], arr[i] );
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
