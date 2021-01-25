package b17413;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

//문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
//
//먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
//
//알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
//문자열의 시작과 끝은 공백이 아니다.
//'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
//태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.
//단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 
//연속하는 두 단어는 공백 하나로 구분한다. 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.
/*
 * 태그 인식 <> 
 * 태그 안의 문자열은 뒤집히면 안된다.
 * 
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split("");
		boolean tag = false;
		StringBuilder sb =new StringBuilder();
		Stack<String> stack = new Stack<>();
		
		
		for(String s : str) {
			
			if(s.equals("<")) {
				sb.reverse();
				bw.write(sb.toString());
				sb.setLength(0);
				stack.push("<");
				bw.write(s);
				tag = true;
			} else if(s.equals(">") && (stack.peek().equals("<"))) {
				stack.pop();
				bw.write(s);
				tag = false;
			} else {
				if(tag) {
					bw.write(s);
				} else {
					if( s.equals(" ")) {
						sb.reverse();
						
						bw.write(sb.toString()+" ");
						sb.setLength(0);
					} else {
						sb.append(s);
					}
				}
			}
			
			
		}
		bw.write(sb.reverse().toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
}
