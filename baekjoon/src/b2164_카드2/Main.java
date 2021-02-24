package b2164_카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= N; i++) {
			que.offer(i);
		}
		
		while(!que.isEmpty()) {
			if(que.size() == 1) {
				System.out.println(que.poll());
				break;
			}
			que.poll();
			que.offer(que.poll());
		}
	}
}
