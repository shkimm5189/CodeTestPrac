package b1789_수듫의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long S = Long.parseLong(br.readLine());
		
		long sum = 0;
		int n = 0;
		while(sum <= S) {
			sum += ++n;
		}
		System.out.println(n-1);
	}
}
