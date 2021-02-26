package b1654_랜선자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int needLine = Integer.parseInt(st.nextToken());
		
		int[] lines = new int[N];
		int max =0;
		for(int i = 0 ; i < lines.length; i++) {
			lines[i] = Integer.parseInt(br.readLine());
 
			max =Math.max(max, lines[i]);
		}
		Arrays.sort(lines);
		long result = 0;
		long start = 1;
		long end = max;
		while(start <= end) {
			long mid = (start+end)/ 2;
			int curLine =0;
			for(int l : lines) {
				curLine += l/mid;
			}
			if(curLine < needLine) {
				end = mid -1;
			} else {
				start = mid+1;
			}
			
			
		}
		System.out.println(end);
		
 	}
}
