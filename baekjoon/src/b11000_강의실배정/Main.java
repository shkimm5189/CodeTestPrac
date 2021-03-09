package b11000_강의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
	int startT;
	int endT;

	Node(int startT,int endT){
		this.startT = startT;
		this.endT = endT;

	}
	@Override
	public int compareTo(Node node) {
		// TODO Auto-generated method stub
		if(this.startT == node.startT)	return this.endT - node.endT;

		return this.startT - node.startT;
	}



}
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Node[] node = new Node[N];
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			node[i] = new Node(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}

		Arrays.sort(node);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(node[0].endT);
		for(int i = 1 ; i < N; i++) {
			if(pq.peek() <= node[i].startT ) pq.poll();
			pq.add(node[i].endT);
		}
		System.out.println(pq.size());
	}
}
