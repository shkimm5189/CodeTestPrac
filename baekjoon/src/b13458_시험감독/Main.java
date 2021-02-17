package b13458_시험감독;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] classRoom = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < N; i++) {
			classRoom[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine()," ");
		int fir =Integer.parseInt(st.nextToken());
		int sec =Integer.parseInt(st.nextToken());
		System.out.println(fir+""+sec);
long cnt = 0;
		for(int i = 0 ; i < classRoom.length;i++) {
			classRoom[i] -= fir;
			cnt++;
			if(classRoom[i] < 0) {
				continue;
			}
			
			cnt += classRoom[i]/sec;
			if(classRoom[i]%sec != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
