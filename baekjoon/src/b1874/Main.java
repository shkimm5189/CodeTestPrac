package b1874;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<>();
		int repeat = Integer.parseInt(br.readLine());
		int start = 0 ; 
		
		for(int i = 0 ; i < repeat ; i++) {
			int idx = Integer.parseInt(br.readLine());
			
			if(idx > start) {
				for(int j = start+1 ; j <= idx; j++) {
					st.push(j);
					sb.append("+\n");
				}
				start = idx;
			} else if(st.peek() != idx ) {
				sb.setLength(0);
				sb.append("NO");
				break;
			}
			
			st.pop();
			sb.append("-\n");
			
		}

		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	
	
}
