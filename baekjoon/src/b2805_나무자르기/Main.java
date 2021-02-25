package b2805_나무자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] tree = new int[N];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < tree.length;i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(tree);
		long start = 0;
		long end = tree[tree.length-1];
		
		while(start <= end) {
			long mid = (start+end)/2;
			long sum = 0;
			for(int t : tree) {
				if(mid < t) {
					sum += t - mid;
				}
			}
			if( sum >= M) {
				start = mid +1;
			}  else {
				end = mid-1;
			}
		}
		System.out.println(end);
		
	}
}
