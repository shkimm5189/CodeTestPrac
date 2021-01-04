package b11729;

import java.util.Scanner;

public class Main {
	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inNum = scan.nextInt();
		
		hanoi(inNum, 1, 2, 3);
		//hanoi(n , start , mid, arrival)
//		System.out.println(cnt);
//		System.out.println(sb);
	}
	public static void hanoi(int inNum, int s , int m, int a) {
		
		cnt++;
		if(inNum == 1) {
			sb.append(s + " " + a+"\n");
			
			return ;
		} else {
			hanoi(inNum-1,s ,a ,m );
			System.out.println("1inNum=" + inNum);
			sb.append(s + " " + a+"\n");
			hanoi(inNum-1,m ,s ,a );
			
			
		}
	}
}
