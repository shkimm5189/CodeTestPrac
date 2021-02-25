package b10816_숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			if(!hash.containsKey(temp)) {
				hash.put(temp, 1);
			} else {
				hash.put(temp, hash.get(temp)+1);
			}
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			if(!hash.containsKey(temp)) {
				sb.append(0).append(" ");
			} else {
				sb.append(hash.get(temp)).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
}
