package b11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 0 ;
		int repeat = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split("");
		
		for(String s : array) {
			result += Integer.parseInt(s);
		}
		
		System.out.println(result);
		
	}
}
