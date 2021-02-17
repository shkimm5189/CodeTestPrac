package b17298;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * 
 * 
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arrNum = new int[N];
		StringBuilder sb = new StringBuilder();
		Queue<Integer> que;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0 ; i < arrNum.length ;i++) {
			arrNum[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0 ; i < arrNum.length-1; i++) {
			que = new LinkedList<>();
			for(int j = i+1 ; j < arrNum.length;j++) {
				if(arrNum[i] < arrNum[j]) {
					que.offer(arrNum[j]);
				}
			}
			if(que.isEmpty()) {
				sb.append(-1+" ");
			} else {
				sb.append(que.poll()+" ");
			}
		}
		sb.append(-1);
		
		System.out.println(sb.toString());
		
	}
}
