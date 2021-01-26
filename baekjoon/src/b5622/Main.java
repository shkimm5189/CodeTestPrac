package b5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split("");
		int ans = 0 ;
		for(String s : str) {
			switch(s) {
			case "A":
			case "B":
			case "C":
				ans +=2;
				break;
			case "D":
			case "E":
			case "F":
				ans +=3;
				break;
			case "G":
			case "H":
			case "I":
				ans += 4;
				break;
			case "J":
			case "K":
			case "L":
				ans+= 5;
				break;
			case "M":
			case "N":
			case "O":
				ans += 6;
				break;
			case "P":
			case "Q":
			case "R":
			case "S":
				ans +=7;
				break;
			case "T":
			case "U":
			case "V":
				ans+= 8;
				break;
			case "W":
			case "X":
			case "Y":
			case "Z":
				ans += 9;
				break;				
			}
			
		}
		System.out.println(ans+str.length);
	}
}
