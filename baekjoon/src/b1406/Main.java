package b1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
 * L 커서 왼쪽으로 한칸 "문장 맨앞이면 무시" 
 * D 커서 오른쪽 한칸 "문장 맨뒤면 무시"
 * B 커서 왼쪽 문자 삭제 "문장 맨앞이면 무시"
 * P $ 커서 오른쪽에 $문자 추가
 */

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat;
		
		Editor edit = new Editor(br.readLine());
		repeat = Integer.parseInt(br.readLine());
		while(repeat-- > 0) {
		
			StringTokenizer st = new StringTokenizer(br.readLine());
			String chk = st.nextToken();
			switch(chk) {
			case "L":
				edit.L();
				break;
			case "D":
				edit.D();
				break;
			case "B":
				edit.B();
				break;
			case "P":
				edit.P(st.nextToken());
				break;
			}
		}
		
		System.out.println(edit.toString());
	}
}
class Editor{
	StringBuilder sb;
	int cursor;
	Editor(String str){
		sb = new StringBuilder();
		String[] temp = str.split("");
		for(String s : temp) {
			sb.append(s);
		}
		cursor = sb.length();
	}
	/*
	 * 문자열로 가는게맞는가?
	 * deque로 가는게 맞는가
	 */
	/*
	 * L 커서 왼쪽으로 한칸 "문장 맨앞이면 무시"
	 */
	public void L() {
		if(cursor != 0) {
			cursor--;
		}
		
		
	}
	/*
	 * D 커서 오른쪽 한칸 "문장 맨뒤면 무시"
	 */
	public void D() {
		if(cursor != sb.length()) {
			cursor++;
		}
		
	}
	/*
	 * B 커서 왼쪽 문자 삭제 "문장 맨앞이면 무시"
	 */
	public void B() {
		
		if(cursor!=0) {
			sb.delete(cursor-1, cursor);
			cursor--;
		}
		
	}
	/*
	 * P $ 커서 오른쪽에 $문자 추가
	 */
	public void P(String s) {
		
		sb.insert(cursor , s);
		cursor++;
	}
	
	@Override
		public String toString() {
		
			return sb.toString();
			
		}
	
	
}