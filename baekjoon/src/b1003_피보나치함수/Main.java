package b1003_피보나치함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Info{
	int zeroCnt;
	int oneCnt;
	
	Info(int zeroCnt,int oneCnt){
		this.zeroCnt=zeroCnt;
		this.oneCnt=oneCnt;
	}
}
public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		Info[] dp;
		while(testCase-- > 0) {
			int num = Integer.parseInt(br.readLine());
			dp = new Info[num+2];
			
			dp[0] = new Info(1,0); 
			dp[1] = new Info(0,1);
			for(int i = 2 ;i <= num; i++) {
				dp[i]=new Info(dp[i-1].zeroCnt+dp[i-2].zeroCnt    ,dp[i-1].oneCnt+dp[i-2].oneCnt);
			}
			
			System.out.println(dp[num].zeroCnt+" "+dp[num].oneCnt);
		}
	}
}
