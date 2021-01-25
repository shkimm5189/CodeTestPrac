package b17298;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 
 * 
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int repeat = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
		
		for(int i = 0 ; i < repeat ;i ++) {
			int temp = Integer.parseInt(str[i]);
			for(int j = i+1 ; j < str.length; j++) {
				if(temp < Integer.parseInt(str[j])) {
					bw.write(str[j]+" ");
					break;
				}
				if(j == str.length-1) {
					bw.write("-1 ");
				}
			}
			
			
		}
		bw.write("-1");
		bw.flush();
		bw.close();
	}
}
