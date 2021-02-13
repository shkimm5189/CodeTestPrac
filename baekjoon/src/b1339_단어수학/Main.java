package b1339_단어수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack = new Stack<>();
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		int repeat = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < repeat ; i++ ) {
			String[] str = br.readLine().split("");
			int base  = str.length;
			for(String s : str) {
				if(hash.containsKey(s)) {
					continue;
				} else {
					hash.put(s, base--);
				}
			}
			for(String key : hash.keySet()) {
				System.out.println(hash.get(key));
			}
		}
		
		
		
		
	}
}
