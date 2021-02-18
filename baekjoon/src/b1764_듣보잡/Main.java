package b1764_듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> noHear = new ArrayList<>();
		ArrayList<String> result = new ArrayList<String>();
		int cnt = 0 ;
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int H = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		while( H-- > 0) {
			noHear.add( br.readLine());

		}
		
		Collections.sort(noHear);
		while( S-- > 0) {
			String find = br.readLine();
			if(Collections.binarySearch(noHear, find) >= 0) {
				
				result.add(find);
				
			}
		}
		System.out.println(result.size());
		Collections.sort(result);
		for(String s : result) {
			System.out.println(s);
		}
	}

}