package b1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		String[] str = br.readLine().toLowerCase().split("");
		
		for(int i = 'a'; i <='z'; i++) {
			hash.put(String.valueOf((char)i), 0);
		}
		
		for(int i = 0 ; i < str.length; i++) {
			hash.put(str[i], hash.get(str[i])+1 );
		}
		int max = 0;
	
		String val = "";
		for(String key : hash.keySet()) {
			if(max < hash.get(key)) {
				
				max = hash.get(key);
				val = key.toUpperCase();
			} 
			else if( (max != 0) && (max == hash.get(key))) {
				val = "?";
			
			}
		}
		for(String s : hash.keySet()) {
			System.out.println(hash.get(s));
		}
		System.out.println(val);
	}
}
