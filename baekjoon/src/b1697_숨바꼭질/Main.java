package b1697_숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] chk;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		chk = new int[1000001];
		int N = Integer.parseInt(st.nextToken());
		
		int K = Integer.parseInt(st.nextToken());
		if(N ==K) {
			System.out.println(0);
			return ;
		}else {
			bfs(N,K);
		}
		
		
	}
	static void bfs(int N ,int K) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.offer(N);
		chk[N] = 1;
		
		while(!que.isEmpty()) {
			int temp = que.poll();
			
			for(int i =0 ; i < 3; i++) {
				int next;
				if(i == 0 ) {
					next = temp + 1;
				} else if(i==1) {
					next = temp - 1;
				} else {
					next = temp * 2;
				}
				
				if(next == K) {
					System.out.println(chk[temp]);
					return ;
				}
				if( next >= 0 && next < chk.length && chk[next] == 0) {
					que.offer(next);
					chk[next] = chk[temp]+1;
				}
			}
			
		}
	}
}
