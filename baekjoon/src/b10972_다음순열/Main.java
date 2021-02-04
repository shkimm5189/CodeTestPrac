package b10972_다음순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static boolean[] visited;
	static int[] arr;
	static int N;
	static Queue<String> que = new LinkedList<String>();
	static StringBuilder sb  =new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		String target=br.readLine();
		visited = new boolean[N];
		arr= new int[N];
		dfs(0);
		while(!que.isEmpty()) {
			if(que.poll().equals(target)) {
				if(que.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(que.poll());
				}
			}
		}
		
	}
	
	
	static void dfs(int depth) {
		if(N == depth) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			
			que.offer(sb.toString().trim());
			sb.setLength(0);
			return ;
		}
		
		for(int i = 0 ; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[depth] = i+1;
				dfs(depth+1);
				visited[i] = false;
			}
			
			
		}
	}
}
