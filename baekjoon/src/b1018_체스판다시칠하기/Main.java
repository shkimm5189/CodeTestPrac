package b1018_체스판다시칠하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[][] board;
	static int min = 64;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		board = new boolean[N][M];
		
		
		for(int i = 0 ; i < N; i++) {
			String str = br.readLine();
			for(int j = 0 ; j < M; j++) {
				if(str.charAt(j)=='B') {
					board[i][j] = true;
				}
			}
		}
		
		int startN = N - 7 ;
		int startM = M - 7 ;
		for(int i = 0 ; i < startN; i++) {
			for(int j = 0 ; j < startM; j++) {
				check(i,j);
			}
		}
		System.out.println(min);
		
	}
	static void check(int N , int M) {
		int lengthN = N + 8 ;
		int lengthM = M + 8;
		int cnt = 0 ;
		boolean start = board[N][M];
		for(int i = N ; i < lengthN; i++) {
			for(int j = M ; j < lengthM; j++) {
				if(board[i][j] != start) {
					cnt++;
				}
				
				start = (!start);
			}
			start = (!start);
		}
		cnt = Math.min(cnt, 64-cnt);
		min = Math.min(min, cnt);
	}
	
	
}


