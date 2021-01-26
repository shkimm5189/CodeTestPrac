package b2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		
		String[] str = br.readLine().split("");
		for(String s : str) {
			sb.append(s);
		}
		
		str = sb.reverse().toString().split(" ");
		System.out.println(Math.max(Integer.parseInt(str[0]), Integer.parseInt(str[1])));
		
		
	}
}
