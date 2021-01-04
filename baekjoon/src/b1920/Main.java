package b1920;

/*
 * 
 * 
b1920 
문제
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.

출력
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
 */
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int[] nArr = new int[N];
		for(int i = 0 ; i < nArr.length ;  i++) {
			nArr[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] mArr = new int[M];
		for(int i = 0 ; i < mArr.length ;  i++) {
			mArr[i] = sc.nextInt();
		}
		
		Arrays.sort(nArr);
		for(int i = 0 ; i < mArr.length; i++) {
			int search = Arrays.binarySearch(nArr, mArr[i]);
			if(search >= 0 ) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
}
