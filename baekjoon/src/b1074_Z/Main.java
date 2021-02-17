package b1074_Z;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {0,0, 1, 0};
	static int[] dy = {0,1, -1, 1};
	static int findX;
	static int findY;
	static boolean[][] board;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st =new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		 findX = Integer.parseInt(st.nextToken());
		findY = Integer.parseInt(st.nextToken());
		
		board = new boolean[(int) Math.pow(2, N)][(int) Math.pow(2, N)];
		for(int i = 0 ; i < board.length; i++) {
			for(int j = 0 ; j < board[i].length; j++) {
				
				if(board[i][j] != true) {
					moving(i,j);
				}
			}
		}
		
	
		
		
		
	}
	static void moving(int nextX , int nextY) {
		for(int i = 0 ; i < dx.length; i++) {
			nextX += dx[i];
			
			nextY += dy[i];
		
			if(nextX < 0 || nextX >= board.length || nextY < 0 || nextY >=board.length) {
				continue;
			}
			
			board[nextX][nextY] =true;
			
			
			if(nextX == findX && nextY == findY) {
				System.out.println(cnt);
				break;
			}
			cnt++;
		}
	
	}
	
	
}


