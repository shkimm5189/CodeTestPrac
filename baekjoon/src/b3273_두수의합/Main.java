package b3273_두수의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arrNum = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < N; i++) {
			arrNum[i] = Integer.parseInt(st.nextToken());
		}
		int sum = Integer.parseInt(br.readLine());
		Arrays.sort(arrNum);
		int cnt = 0;
		int jdx = arrNum.length-1;
		int idx = 0;
		while(idx < jdx) {
			if(arrNum[idx] + arrNum[jdx] == sum) {
				cnt++;
				idx++;
			}
			if(arrNum[idx] + arrNum[jdx] < sum) {
				idx++;
			} else {
				jdx--;
			}
		}
		System.out.println(cnt);
	}
}
