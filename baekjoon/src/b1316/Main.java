package b1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 해당 단어가 다시 등장하는지 
// 다시 등장한다면 그룹단어가 아니다.

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int repeat = Integer.parseInt(br.readLine());
		int ans = 0 ;
		Queue<String> que;
		
		while(repeat-- > 0) {

			String[] s = br.readLine().split("");
			 que = new LinkedList<String>();
			for(int i = 0 ; i < s.length; i++) {
				String temp = s[i];
				if(i+1 < s.length && temp.equals(s[i+1]) ) {
					continue;
				} else {
					que.offer(temp);
				}	
			}
			boolean ch = true;
			while(!que.isEmpty()) {
				if(que.contains(que.poll())) {
					ch = false;
					break;
				}
			}
			if(ch) {
				ans++;
			}
			
		}
		System.out.println(ans);
	}
}
