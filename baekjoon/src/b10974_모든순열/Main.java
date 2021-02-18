package b10974_모든순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		
		int base = Integer.parseInt(br.readLine());
		int[] arr = new int[base];
		boolean[] visited = new boolean[base];
		
		
		dfs(base,0);
	}
	
	static void dfs(int base,int depth) {
		arr[depth] = 
		if(base == depth) {
			
			return;
		}
		
	}
}
