package b1260;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int board[][];
	static boolean visited[];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		board = new int[N+1][N+1]; 
		int start  = sc.nextInt();
		for(int i = 1 ; i <= M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			board[a][b] = 1 ;
			board[b][a] = 1 ;
		}
		
		visited = new boolean[N+1];
		dfs(start);
		System.out.println();
		visited = new boolean[N+1];
		bfs(start);
	}
	
	static void dfs(int start) {
		visited[start] = true;
		System.out.print(start + " " );
		if(start == board.length) {
			return ;
		}
		
		for(int i=1; i < board.length ; i++) {
			if(board[start][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	
	static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(start);
		visited[start] = true;
		System.out.print(start+ " ");
		
		while(!que.isEmpty()) {
			int temp = que.peek();
			que.poll();
			for(int i = 1 ; i < board.length; i++) {
				if(board[temp][i] == 1 && visited[i] == false) {
					que.offer(i);
					visited[i] = true;
					System.out.print(i+ " ");
				}
			}
		}
		
	}
}
