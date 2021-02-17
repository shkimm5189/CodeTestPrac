package b1012_유기농빼추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int M;
	static int N;
	static boolean[][] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			board = new boolean[N+2][M+2];
			int bug = Integer.parseInt(st.nextToken());
			while(bug-- > 0) {
				String[] str = br.readLine().split(" "); 
				board[Integer.parseInt(str[1])+1][Integer.parseInt(str[0])+1] = true;
			}
			int cnt = 0 ;


			for(int i = 1; i < board.length-1;i++) {
				for(int j = 1 ; j < board[i].length-1; j++) {
					if(board[i][j] == true) {
						dfs(i,j);
						cnt++;
					}
				}
			}


			System.out.println(cnt);
		}
	}

	static void dfs(int x,int y) {

		for(int pos = 0 ;pos < dx.length; pos++) {
			if(board[x+dx[pos]][y+dy[pos]] == false) {
				continue;
			}
			board[x+dx[pos]][y+dy[pos]] = false;
			dfs(x+dx[pos],y+dy[pos]);
		}
	}
}
