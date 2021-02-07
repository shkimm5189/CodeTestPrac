package b1463_1로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	static int[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine());
		dp = new int[val+1];
		
	}
	static int searching(int val , int depth) {
		if(val == 1) {
			return 0;
		} 
		
	}
}
