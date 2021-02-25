package b10815_숫자카드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arrNum = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < arrNum.length;i++) {
			arrNum[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrNum);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		while(st.hasMoreTokens()) {
			if(Arrays.binarySearch(arrNum,Integer.parseInt(st.nextToken()))< 0){
				sb.append(0).append(" ");
			} else {
				sb.append(1).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
}
