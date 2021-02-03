package b2577_숫자의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int x = Integer.parseInt(br.readLine());
		int y= Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		HashMap<String, Integer> hash = new HashMap<>();
		for(int i = 0; i <=9; i++) {
			hash.put(String.valueOf(i), 0);
		}
		int result = x*y*z;
		String[] s = String.valueOf(result).split("");
		
		for(int i = 0 ; i <s.length;i++) {
			hash.put(s[i], hash.get(s[i])+1);
		}
		System.out.println();
		for(String key : hash.keySet()){
			System.out.println(hash.get(key));
		}
		
	}
}
