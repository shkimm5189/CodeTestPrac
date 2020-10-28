package B1065;

import java.util.Scanner;

//문제
//어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 
//1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CountNum ct = new CountNum();
		System.out.println(ct.countNum(sc.nextInt()));
	}
}
class CountNum{
	public int countNum(int num) {
		int cnt;
		if( num < 100 ) {
			return num;
		} else {
			cnt = 99;
			if(num == 1000)
				num = 999;


			for(int i =100 ; i <= num; i++) {
				int hund = i/100;
				int ten = (i/10) % 10;
				int one = i % 10;

				if((hund -ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
