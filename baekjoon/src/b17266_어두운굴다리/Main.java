package b17266_어두운굴다리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] road = new int[M];
		
		for(int i = 0 ; i < M;i++) {
			road[i] = Integer.parseInt(st.nextToken());
		}
		int max = road[0];
		for(int i = 1 ; i < M; i++) {
			max =  Math.max(max, road[i]-road[i-1]);
			
		}
		max =  Math.max(max, N - road[M-1]);
		System.out.println(max);
	}
}
