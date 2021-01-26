package b10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		
		for(int i = 'a' ; i <= 'z' ;i++) {
			hash.put(String.valueOf((char)i), -1);
		}
		
		String[] str = br.readLine().split("");
		
		for(int i = 0 ; i < str.length; i++) {
			if(hash.get(str[i]) != -1) {
				continue;
			}
			hash.put(str[i], i);
		}
		
		for( String s : hash.keySet()) {
			System.out.print(hash.get(s)+" ");
		}
	}
}
