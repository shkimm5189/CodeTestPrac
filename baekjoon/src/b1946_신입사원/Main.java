package b1946_신입사원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCaseN = Integer.parseInt(br.readLine());
		StringBuilder sb =new StringBuilder();
		StringTokenizer st ;
		while(testCaseN-- > 0 ) {
			int N = Integer.parseInt(br.readLine());
			int[] arrRank = new int[N+1];
			for(int i = 0 ;i < N; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int docRank = Integer.parseInt(st.nextToken());
				int interRank = Integer.parseInt(st.nextToken());
				arrRank[docRank] = interRank;
			}
			
			int max = 1 ;
			int temp = arrRank[1];
			for( int i = 2 ; i <= N; i++) {
				if(arrRank[i] < temp) {
					max++;
					temp = arrRank[i];
				}
			}
			sb.append(max).append("\n");
			
		}
		
		System.out.println(sb);
	}
}