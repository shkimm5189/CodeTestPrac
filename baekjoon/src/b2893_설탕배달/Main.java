package b2893_설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int five = 0 ;
		int thr = 0;

		int val = Integer.parseInt(br.readLine());
		if(val == 4 || val == 7) {
			System.out.println(-1);
			
		} else if(val%5 == 0) {
			System.out.println(val/5);
			
		} else if(val%5 == 1 || val%5 == 4) {
			five = (val/5) - 1 ;
			if(five == 0) {
				System.out.println(val/3);
				return ;
			}
			val = val - (five * 5);
			thr = (val/five)/3;
			System.out.println(five + thr);
		} else if(val%5 == 2 ){
			five = (val/5) - 2;
			if(five == 0) {
				System.out.println(val/3);
				return ;
			}
			val = val - (five * 5);
			thr = (val/five)/3;
			System.out.println(five + thr);
		} else if(val%5 == 3) {
			five = (val/5);
			if(five == 0) {
				System.out.println(val/3);
				return ;
			}
			val = val%5;
			thr = val/3;
			System.out.println(five + thr);
			
		}
	}


}
