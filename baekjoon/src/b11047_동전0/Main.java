package b11047_동전0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int val = Integer.parseInt(st.nextToken());
		int cnt = 0 ;
		Integer[] board = new Integer[N];
		for(int i = 0 ; i < N; i++) {
			board[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(board,Collections.reverseOrder());
		for(int i = 0 ;i < N; i++) {
			if(val/board[i] <= 0) {
				continue;
			}
			cnt += val/board[i];
			val = val%board[i];
		}
		System.out.println(cnt);
	}
}
