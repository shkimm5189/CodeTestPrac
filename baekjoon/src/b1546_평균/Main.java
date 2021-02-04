package b1546_평균;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		double[] arr = new double[repeat];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		double max = arr[arr.length-1];
		double sum = 0 ;
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = (arr[i]/max)*100;
			
			sum+=arr[i];
		}
		System.out.println(sum/repeat);
		
	}
}
