package b2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		StringBuilder sb = new StringBuilder(); 
		int repeat = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < repeat; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			String[] str = st.nextToken().split("");
			for(int j = 0 ; j < str.length ;j++) {
				int temp = n ;
				while(temp-- > 0) {
					sb.append(str[j]);
				}
			}
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
	}
}
