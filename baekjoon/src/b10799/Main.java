package b10799;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> bd = new Stack<>();

		int ans =0 ;

		String[] str = br.readLine().split("");

		for(int i = 0 ; i < str.length; i++) {
			if(str[i].equals("(")) {
				bd.push("(");
			} else {
				if(str[i-1].equals("(")) {
					bd.pop();
					ans += bd.size();
				} else {
					bd.pop();
					ans +=1;
				}
			}
		}
		bw.write(ans+"\n");
		bw.flush();
		bw.close();


	}


}
