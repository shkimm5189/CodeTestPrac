package b1927_최소힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> priQue = new PriorityQueue<Integer>();
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			int temp = Integer.parseInt(br.readLine());
			
			if(temp == 0) {
				if(priQue.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(priQue.poll()).append("\n");
				}
			} else {
				priQue.offer(temp);
			}
		}
		System.out.println(sb.toString().trim());
	}
}
