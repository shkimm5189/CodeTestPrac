package b2567_색종이2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		boolean[][] board = new boolean[102][102];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		//북쪽 부터 시계방향 4방
		int[][] direc = {{-1,0} , {0,1} , {1,0},{ 0,-1}};
	
		
		int num = Integer.parseInt(br.readLine());
		while(num-- > 0) {
			st = new StringTokenizer(br.readLine()," ");
			int startX = Integer.parseInt(st.nextToken())+1;
			int startY = (Integer.parseInt(st.nextToken())) + 10;
			for(int i = startX ;  i < startX+10;i++) {
				for(int j =startY; j >startY-10 ; j--) {
					board[i][j] = true;
				}
			}	
		}
		int cnt = 0 ;
		for(int i = 0 ; i < board.length; i++) {
			for(int j = 0 ; j <board[i].length; j++) {
				if(board[i][j]) {
					for(int z =0 ;z < direc.length; z++ ) {
						int tempI;
						int tempJ;
						tempI = i + direc[z][0];
						tempJ = j + direc[z][1];
						if(tempI < 0 || tempJ < 0 || tempI > 101 ||tempJ > 101) {
							continue;
						}
						if(!board[tempI][tempJ]) {
							cnt++;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
