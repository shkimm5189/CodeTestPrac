package b1463_1로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	
	static int min;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine());
		min = val;
		dfs(val,0);
		
		System.out.println("result "+min);
	}
	
	static void dfs(int val, int depth) {
		if(val == 1) {
			min = Math.min(min ,depth);
			return ;
		}
		if(val%3 == 0) {
			dfs(val/3,depth+1);
		}
		if(val%2 == 0) {
			
			dfs(val/2,depth+1);
		}
		dfs(val-1,depth+1);
	}
}
