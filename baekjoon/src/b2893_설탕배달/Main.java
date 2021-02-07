package b2893_설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int val = Integer.parseInt(br.readLine());
		if(val == 4 || val == 7) {
			System.out.println(-1);	
		} else if(val % 5 == 1  || val % 5 == 3) {
			System.out.println((val/5) +1);
		} else if(val % 5 == 2  || val % 5 == 4) {
			System.out.println((val/5) +2);
		} else if(val % 5 == 0 ) {
			System.out.println(val/5);
		}
	}


}
