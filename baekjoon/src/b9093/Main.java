package b9093;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] str;
		
		int repeat = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < repeat; i++) {
			str = br.readLine().split(" ");
			for(int j = 0 ; j < str.length; j++) {
				for(int z = str[j].length() - 1 ; z >= 0 ; z--) {
					char temp = str[j].charAt(z);
					sb.append(temp);
				}
				
			}
			
		}
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
		
	}
}
