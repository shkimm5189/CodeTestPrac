package b14501_퇴사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Commu {
	int day;
	int price;
	
	Commu(int day , int price){
		this.day = day;
		this.price = price;
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int repeat = Integer.parseInt(br.readLine());
		Commu[] com = new Commu[repeat];
		int[] dp = new int[repeat+1];
		for(int i = 0 ; i < repeat; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			com[i] = new Commu(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		
		for(int i = 0 ; i < repeat; i++) {
			if(i+ com[i].day <= repeat) {
				dp[i+com[i].day] = Math.max(dp[i+com[i].day], dp[i]+com[i].price);
			}
			dp[i+1] =Math.max(dp[i], dp[i+1]);
			
			
		}
		System.out.println(dp[repeat]);
	}
}
