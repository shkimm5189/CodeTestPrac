package b10818_최소최대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int min = 0;
		
		int repeat = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
		max = Integer.parseInt(str[0]);
		min = Integer.parseInt(str[0]);
		for(String s : str) {
			max =  Math.max(max , Integer.parseInt(s));
			min =  Math.min(min , Integer.parseInt(s));
		}
		
		System.out.println(max+" "+min);
	}
}
