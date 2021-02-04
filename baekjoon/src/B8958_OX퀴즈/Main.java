package B8958_OX퀴즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int repeat = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < repeat;i++) {
			String[] str = br.readLine().split("");
			int sum =0;
			int cnt = 0;
			for(int j = 0 ; j < str.length; j++) {
				if(str[j].equals("O")) {
					cnt++;
					sum+=cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
