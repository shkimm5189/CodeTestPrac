package b4796_캠핑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int cnt = 0 ;
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			cnt++;
			long L = Long.parseLong(st.nextToken());
			long P = Long.parseLong(st.nextToken());
			long V = Long.parseLong(st.nextToken());
			if(L == 0)  break;
			
			long possibleDay = V / P;
			
			possibleDay = possibleDay * L;
			
			possibleDay = possibleDay + Math.min(L, (V%P)) ;  
			sb.append("Case "+ cnt+": "+possibleDay+"\n");
		}
		System.out.println(sb);
	}
}
