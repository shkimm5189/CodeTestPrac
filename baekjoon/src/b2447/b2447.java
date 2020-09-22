package b2447;

import java.util.Scanner;

public class b2447 {
	public static void star(int n) {
		if(n==0) {
			return ;
		} else {
			star(n-1);
			System.out.println("*");
		}
		
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		star(n);
	}
}
