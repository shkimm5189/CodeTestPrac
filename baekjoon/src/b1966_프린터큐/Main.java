package b1966_프린터큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class Printer{
	int number;
	int priority;
	Printer(int number ,int priority){
		this.number = number;
		this.priority = priority;
	}
}

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<Printer> que ;
		
		int repeat = Integer.parseInt(br.readLine());
		
		while(repeat-- > 0) {
			que = new LinkedList<>();
			st = new StringTokenizer(br.readLine()," ");
			int cnt=0;
			int length = Integer.parseInt(st.nextToken());
			int findPos = Integer.parseInt(st.nextToken());
			
			Stack<Integer> pri = new Stack<Integer>(); 
			String[] priority = br.readLine().split(" ");
			for(String s : priority) {
				pri.add(Integer.parseInt(s));
				que.offer(new Printer(cnt++,Integer.parseInt(s)));
			}
			Collections.sort(pri);
			
			cnt =1 ;
			while(!que.isEmpty()) {
				if(pri.peek() == que.peek().priority) {
					if(findPos == que.peek().number) {
						System.out.println(cnt);
						break;
					}
					pri.pop();
					que.poll();
					
					cnt++;
				} else {
					que.offer(que.poll());
				}
					
					
			}
		}//while
	}
}
