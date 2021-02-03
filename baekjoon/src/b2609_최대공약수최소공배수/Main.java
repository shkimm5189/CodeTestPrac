package b2609_최대공약수최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int numOne = Integer.parseInt(st.nextToken());
		int numTwo = Integer.parseInt(st.nextToken());
		Solve ans = new Solve(numOne,numTwo);
		
		System.out.println(ans.GCD(numOne, numTwo));
		System.out.println(ans.LCM(numOne, numTwo));
	}
	
}

class Solve{
	int numOne;
	int numTwo;
	
	Solve(int numOne , int numTwo){
		this.numOne = numOne;
		this.numTwo = numTwo;
	}
	
	public int GCD(int numOne, int numTwo) {
		if(numTwo == 0) {
			return numOne;
		} else {
			return GCD(numTwo,numOne%numTwo);
		}
	}
	public int LCM(int numOne,int numTwo) {
		return numOne/GCD(numOne,numTwo) * numTwo/GCD(numOne,numTwo) * GCD(numOne,numTwo); 
	}
}