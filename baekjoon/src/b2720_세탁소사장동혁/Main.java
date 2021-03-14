package b2720_세탁소사장동혁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] coins = {25,10,5,1}; 
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			int cost = Integer.parseInt(br.readLine());
			for(int coin : coins) {
				int cnt = cost / coin;
				cost -= (coin * cnt);
				sb.append(cnt+" ");
				
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
