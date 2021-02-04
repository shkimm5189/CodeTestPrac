package b10845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//push X: 정수 X를 큐에 넣는 연산이다.
//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

public class Main {
	public static void main(String[] args) throws IOException{
		Queue que = new Queue();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		int repeat = Integer.parseInt(br.readLine());
		
		while(repeat -- > 0) {
			StringTokenizer strToken = new StringTokenizer(br.readLine());
			
			switch(strToken.nextToken()) {
			case "push":
				que.push(Integer.parseInt(strToken.nextToken()));
				break;
			case "pop":
				bw.write(que.pop()+"\n");
				break;
			case "size":
				bw.write(que.size()+"\n");
				break;
			case "empty":
				bw.write(que.empty()+"\n");
				break;
			case "front":
				bw.write(que.front()+"\n");
				break;
			case "back":
				bw.write(que.back()+"\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}


class Queue{
	class Node{
		int data;
		Node nextNode;
		Node(int data){
			this.data = data;
			nextNode = null;
		}
	}
	private Node front;
	private Node back;
	private int size = 0;
	
	//push X: 정수 X를 큐에 넣는 연산이다.
	public void push(int data) {
		Node newNode = new Node(data);
		if(back != null) {
			back.nextNode = newNode;
		}
		back = newNode;
		if(front == null) {
			front = back;
		}
		this.size++;
	}
	
//	pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int pop() {
		if(front == null) {
			return -1;
		} else {
			int temp = front.data;
			
			front = front.nextNode;
			
			if(front == null) {
				back = null;
			}
			this.size--;
			return temp;
		}
		
	}

//	size: 큐에 들어있는 정수의 개수를 출력한다.
	public int size() {
		if(this.size <= 0) {
			this.size = 0;
		}
		return size;
	}
	
//	empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
	public int empty() {
		if(front == null) {
			return 1;
		}else {
			return 0;
		}
	}
	
//	front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int front() {
		if(front == null) {
			return -1;
		} else {
			return front.data;
		}
	}
	
//	back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int back() {
		if(back == null) {
			return -1;
		} else {
			return back.data;
		}
	}
}

