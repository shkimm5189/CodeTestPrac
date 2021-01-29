package B1476_날짜계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st =new StringTokenizer(br.readLine(), " ");
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt =0;

		Queue<Integer> queE = new LinkedList<Integer>();
		Queue<Integer> queS = new LinkedList<Integer>();
		Queue<Integer> queM = new LinkedList<Integer>();

		for(int i = 1 ; i <=15 ;i++) {
			queE.offer(i);
		}
		for(int i = 1 ; i <=28 ;i++) {
			queS.offer(i);
		}
		for(int i = 1 ; i <=19 ;i++) {
			queM.offer(i);
		}

		while(true) {
			cnt++;
			int tempE = queE.poll();
			int tempS = queS.poll();
			int tempM = queM.poll();
			if(tempE==E && tempS == S && tempM == M) {
				System.out.println(cnt);
				break;
			}
			queE.offer(tempE);
			queS.offer(tempS);
			queM.offer(tempM);
				
		}
	}
}
