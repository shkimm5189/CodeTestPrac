package b4344_평균은넘겠지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int repeat = Integer.parseInt(br.readLine());
		
		while(repeat-- >0) {
			int sum = 0 ;
			st = new StringTokenizer(br.readLine()," ");
			int re = Integer.parseInt(st.nextToken());
			int arr[] = new int[re];
			for(int i = 0 ; i < re; i++) {
				int temp = Integer.parseInt(st.nextToken());
				arr[i] = temp;
				sum += temp;
			}
			double aver = sum / re;
			double cnt = 0 ;
			for(int i = 0 ; i < arr.length; i++) {
				if( arr[i] > aver ) {
					
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n",(cnt/re) *100);
			
		}
	}
}
