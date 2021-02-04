package b2606;


import java.util.Scanner;

public class Main {
	static int N ;
	static int cnt = 0 ;
	static int board[][];
	static boolean visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int M = sc.nextInt();
		board = new int[N+1][N+1];
		visited = new boolean[N+1];
		for(int i = 0 ; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			board[a][b] = 1;
			board[b][a] = 1;
		}
		dfs(1);
		
		System.out.println(cnt);
	}
	static void dfs(int start) {
		visited[start] = true;
		if(start == board.length) {
			return;
		}
		for(int i = 1 ; i < board.length; i++) {
			if(board[start][i] == 1 && !visited[i] ) {
				dfs(i);
				cnt++;
			}
		}
	}
}
