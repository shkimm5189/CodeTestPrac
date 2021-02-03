package b3052_나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int cnt=1;
		for(int i = 0 ; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[i] = n%42;
		}
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length-1 ; i++) {
			if( arr[i] != arr[i+1]  ) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
