package b1018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sn=1;
		int sm=1;
		int cntS;
		ArrayList<Integer> min = new ArrayList<>();
		char[][] board = new char[n][m];

		for(int i =0 ; i < n; i++ ) {
			String str = sc.next();
			for(int j = 0; j < m; j++) {
				board[i][j] = str.charAt(j);
			}
		}
		

		for(int i = 0 ; i < n-7;i++) {
			for(int j = 0;j < m-7 ;j++) {
				min.add(chkChess(i,j,board));
				
			}
		}
		System.out.println(Collections.min(min));
		
	}
	public static int chkChess(int n, int m,char[][] board) {
		int cnt = 0;
		if(board[n][m] == 'W') {
			for(int i = n ; i < n+8; i+=2) {
				for(int j = 0; j < m+8; j+=2) { //짝수
					if(board[i][j] != board[n][m])
						cnt++;
				}
				for(int j = 1; j < m+8; j+=2) { // 홀수
					if(board[i][j] != board[n][m+1]) 
						cnt++;
				}	
			}
			for(int i = m+1 ; i < n+8; i+=2) {
				for(int j = 0; j < m+8; j+=2) { //짝수
					if(board[i][j] != board[m][n])
						cnt++;
				}
				for(int j = 1; j < m+8; j+=2) { // 홀수
					if(board[i][j] != board[m][n+1]) 
						cnt++;
				}

			}
		}else if(board[n][m] == 'B') {
			for(int i = n ; i < n+8; i+=2) {
				for(int j = 0; j < m+8; j+=2) { //짝수
					if(board[i][j] != board[n][m])
						cnt++;
				}
				for(int j = 1; j < m+8; j+=2) { // 홀수
					if(board[i][j] != board[n][m+1]) 
						cnt++;
				}	
			}
			for(int i = m ; i < n+8; i+=2) {
				for(int j = 0; j < m+8; j+=2) { //짝수
					if(board[i][j] != board[m][n])
						cnt++;
				}
				for(int j = 1; j < m+8; j+=2) { // 홀수
					if(board[i][j] != board[m][n+1]) 
						cnt++;
				}

			}
		}
		return cnt;
	}
	
}


