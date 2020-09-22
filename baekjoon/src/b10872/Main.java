package b10872;

import java.util.Scanner;

public class Main {
	public int fact(int inNum){
		
		if( inNum == 1 || inNum == 0) {
			return 1;
		}
		return inNum * fact(inNum-1);
	}
	public static void main(String[] args) {
		int inNum;
		int res;
		Scanner scan = new Scanner(System.in);
		
		inNum = scan.nextInt();
		
		Main myFunc = new Main();
		res = myFunc.fact(inNum); 
		System.out.println(res);
	}
}
