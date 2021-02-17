package b1052_물병;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//먼저 같은 양의 물이 들어있는 물병 두 개를 고른다. 그 다음에 한 개의 물병에 다른 한 쪽에 있는 물을 모두 붓는다.
//이 방법을 필요한 만큼 계속 한다.
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int buy = 0 ;
		
		while( true ) {
			int cnt =0 ;
			int temp = N;
			while(temp > 0) {
				if(temp%2 != 0) {
					cnt++;
					
				}
				temp = temp/2;
			}
			
			if( cnt <= K) {
				break;
			}
			buy++;
			N++;
		}
		System.out.println(buy);
	}
}
