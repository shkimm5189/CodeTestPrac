package b2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//int형 자릿수 구하기 (int)Math.log10(int)+1; 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		int rlt = 0;
		for (int i = 0 ; i < n; i++) {
			int temp = i;
			int sum = temp;
			while(temp > 0) {
				sum +=temp%10; 
				temp /= 10;
			}
			if(sum == n) {
				rlt = i;
				break;
			} 
		}
		System.out.println(rlt);
		
	}
}
