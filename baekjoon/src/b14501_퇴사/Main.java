package b14501_퇴사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int repeat = Integer.parseInt(br.readLine());
		int[] day = new int[repeat];
		int[] price = new int[repeat];
		for(int i = 0 ; i < repeat; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			day[i] = Integer.parseInt(st.nextToken());
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		int lastDay = 0 ;
		int result = 0;
		for(int i = 0 ; i < repeat; i++) {
			lastDay = i;
			int sum = 0;
			for(int j =lastDay ; j < repeat; j++) {
				if(lastDay+day[lastDay] < repeat+1) {
					sum += price[lastDay];
					lastDay += day[lastDay];
				}
				
			}
			result = Math.max(result, sum);
			
		}
		System.out.println(result);
	}
}
