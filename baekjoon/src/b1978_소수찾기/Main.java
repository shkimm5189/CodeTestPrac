package b1978_소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static boolean[] board;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		board = new boolean[1001];
		int cnt = 0 ;
		isPrimeNum();
		String[] str = br.readLine().split(" ");
		for(int i = 0 ; i < str.length;i++) {
			if(str[i].equals("0")) continue;
			if(!board[Integer.parseInt(str[i])]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
		
		
	}
	//에라토스테네스의 체
	static void isPrimeNum() {
		board[1] = true;
		for(int i = 2 ; i < board.length; i++) {
			for( int j = 2 ; i*j < board.length ;j++) {
				
				board[i*j] = true;
			}
		}
		
	}
}
