package b2512_예산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] cost = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int sum = 0;
		int max = 0;
		for(int i = 0 ; i < N; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, cost[i]);
			sum += cost[i];
		}
		int limit = Integer.parseInt(br.readLine());
		
		int start = 0 ;
		int end = limit;
		int ans = 0;
		if(sum <= limit) {
			System.out.println(max);
			return ;
		}
		while(true) {
			int mid = (start+end)/2;
			sum = 0;
			if(start == mid) {
				break;
			}
			for(int i = 0 ; i < N; i++) {
				if(mid >= cost[i]) {
					sum += cost[i];
				} else {
					sum += mid; 
				}
			}
			if(sum <= limit) {
				ans = Math.max(ans,mid);
				start = mid;
			} else {
				end = mid;
			}
			
		}
		System.out.println(ans);
	}
}
