package b1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
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
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
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
		br.close();
		bw.write(edit.toString());
		bw.flush();
		bw.close();
	}
}
class Editor{
	Stack<String> rightSt;
	Stack<String> leftSt;
	Editor(String str){
		rightSt = new Stack<>();
		leftSt = new Stack<>();
			
		String[] atr = str.split("");
		for(String s : atr) {
			leftSt.push(s);
		}
	}
	/*
	 * 문자열로 가는게맞는가?
	 * deque로 가는게 맞는가
	 */
	/*
	 * L 커서 왼쪽으로 한칸 "문장 맨앞이면 무시"
	 */
	public void L() {
		if(!leftSt.empty()) {
			rightSt.push(leftSt.pop());
		}
	}
	/*
	 * D 커서 오른쪽 한칸 "문장 맨뒤면 무시"
	 */
	public void D() {
		if(!rightSt.empty()) {
			leftSt.push(rightSt.pop());
		}

	}
	/*
	 * B 커서 왼쪽 문자 삭제 "문장 맨앞이면 무시"
	 */
	public void B() {
		if(!leftSt.empty()) {
			leftSt.pop();
		}
	}
	/*
	 * P $ 커서 오른쪽에 $문자 추가
	 */
	public void P(String s) {
		leftSt.push(s);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();
		while(!leftSt.empty()) {
			rightSt.push(leftSt.pop());
		}
		while(!rightSt.empty()) {
				sb.append(rightSt.pop());
		}
		return sb.toString();
	}
}