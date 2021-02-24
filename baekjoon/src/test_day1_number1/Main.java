package test_day1_number1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//악당은 하나라도 터지면 우주가 멸망해버리는 폭탄 ( 를 발사하고 용사는 폭탄을 막는 레이저 ) 를 발사하며 싸우고 있다.
//
//용사가 악당이 발사하는 폭탄의 개수와 같은 개수의 레이저를 발사하면 폭탄이 터지는 것을 막을 수 있지만, 
//만약 용사가 악당이 발사하는 폭탄 개수보다 더 많은 레이저를 발사할 경우에는 용사의 강력한 힘으로 인해 우주가 멸망하게 된다.
//
//예를 들어, (())()() 또는 ))))(((( 의 경우 폭탄과 레이저의 개수가 일치하여 방어에 성공했지만, 
//((()((()) 또는 )))(()) 의 경우에는 폭탄이 레이저보다 많거나 레이저가 폭탄보다 많아 강력한 힘에 의해 우주가 멸망하게 된다.
//
//용사와 악당의 전투 결과 즉, 우주 멸망을 막았으면 YES, 아니면 NO를 출력하시오.
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int humanCnt = 0 ;
		int aliCnt = 0;
		String[] str = br.readLine().split("");
		for(String s : str) {
			
			
			if(s.equals("(")) {
				humanCnt++;
				
			} else if(s.equals(")")){
				aliCnt++;
				
			}
		}
		
		if(humanCnt == aliCnt) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		
	}
}
