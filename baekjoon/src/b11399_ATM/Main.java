package b11399_ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		int[] wait = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < wait.length; i++) {
			wait[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(wait);
		int sum = 0 ;
		int result = 0;
		for(int i = 0; i < wait.length; i++) {
			sum += wait[i]; 
			result += sum;
		}
		System.out.println(result);
		int $a = 10;
		int b ='김';
		System.out.println((char)b);
	}

}
