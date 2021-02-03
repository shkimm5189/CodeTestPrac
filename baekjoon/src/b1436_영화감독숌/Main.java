package b1436_영화감독숌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int temp = Integer.parseInt(br.readLine());
		
		int i = 0;
		int init = 665;
		int max = 0 ;
		while(i < temp ) {
			init++;
			String s = String.valueOf(init);
			if(s.contains("666")) {
				init = Integer.parseInt(s);
				max = Math.max(init, max) ;
				i++;
			}
			
		}
		
		System.out.println(max);
	}
}
