package b2562_최댓값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int idx =  0 ;
		int max = 0;
		
		for(int i = 0 ; i < 9; i++) {
			int n = Integer.parseInt(br.readLine());
			if( max < n) {
				max = n;
				idx = i+1;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}
}
