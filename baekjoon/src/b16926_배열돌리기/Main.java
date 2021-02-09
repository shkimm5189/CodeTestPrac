package b16926_배열돌리기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int times = Integer.parseInt(st.nextToken());
		int[][] board = new int[N][M];
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0 ; j < M; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		/*
		 * 사각형의 꼭지점일 경우
		 *  (왼쪽 위 )i == 0, j == 0 (오른쪽위) i == 0 , j == M-1 
		 *  (왼쪽 아래)i == N-1 , j == 0 (오른쪽 아래)i == N-1, j == M-1
		 *  
		 */
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; i < M ; j++) {
				
			}
		}
		
	}
}
