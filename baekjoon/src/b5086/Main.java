package b5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int numOne = Integer.parseInt(st.nextToken());
			int numTwo = Integer.parseInt(st.nextToken());
			
			if(numOne == 0 && numTwo == 0) {
				break;
			}
			//첫 번째 숫자가 두 번째 숫자의 약수이다.
			if((numTwo % numOne) == 0) {
				System.out.println("factor");
			} else if((numTwo/numOne)==0 && (numOne%numTwo) == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
			//첫 번째 숫자가 두 번째 숫자의 배수이다.
			
			//첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
		}
		
	}
}
