package b1929_소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	static boolean[] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int startNum = Integer.parseInt(st.nextToken());
		int endNum = Integer.parseInt(st.nextToken());
		board = new boolean[endNum+1];
		
		isPrimeNum();
		for(int i = startNum ; i <= endNum; i++) {
			if(!board[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	static void isPrimeNum() {
		board[1] = true;
		for(int i = 2 ; i <= Math.sqrt(board.length); i++) {
			for( int j = 2 ; i*j <= board.length ;j++) {
				if(!board[i*j]) board[i*j] = true;
			}
		}
	}
}
