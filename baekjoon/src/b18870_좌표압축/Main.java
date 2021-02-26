package b18870_좌표압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb =new StringBuilder();
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		int[] point = new int[N];
		int[] sortedPoint = new int[N];
		int cnt = 0;
		for(int i = 0 ; i < N; i++) {
			point[i] = Integer.parseInt(st.nextToken());
		}
		sortedPoint = point.clone();
		Arrays.sort(sortedPoint);
		
		for(int i = 0 ; i<N;i++) {
			if(!hash.containsKey(sortedPoint[i])) {
				hash.put(sortedPoint[i], cnt++);
			} else {
				continue;
			}
		}
		
		for(int i : point) {
			sb.append(hash.get(i)).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
