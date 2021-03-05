package b13305_주유소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
	long price;
	long length;
	
	
}
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int N = Integer.parseInt(br.readLine());
		Node[] node = new Node[N]; 
		long sum = 0;
		
		// 객체 배열 초기화.
		for(int i = 0 ; i < N; i++) {
			node[i] = new Node();
		}
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < N-1; i++) {
			node[i].length = Integer.parseInt(st.nextToken());
		
		}
		
		st= new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < N; i++) {
			node[i].price = Integer.parseInt(st.nextToken());
		}
		
		sum = node[0].price*node[0].length;
		long minPrice = node[0].price ;
		for(int i = 1 ; i < node.length; i++) {
			if(node[i].price < node[i-1].price ) {
				minPrice = Math.min(minPrice , node[i].price);
			}
			sum += (minPrice * node[i].length);
		}
		System.out.println(sum);
		
		
	}
}
