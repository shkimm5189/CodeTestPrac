package b10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//" '정수'를 저장하는 스택 구현 하세요."
public class Main {
	public static void main(String[] args) throws IOException{
		MyStack st = new MyStack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());

		for(int i = 0 ; i < num ; i++) {
			String[] str = br.readLine().split(" ");
			switch(str[0]) {
			case "push":
				st.push(Integer.parseInt(str[1]));
				break;
			case "pop":
				bw.write(st.pop()+"\n");
				break;
			case "top":
				bw.write(st.top()+"\n");
				break;
			case "size":
				bw.write(st.size()+"\n");
				break;
			case "empty":
				bw.write(st.empty()+"\n");
				break;
			}

		}
		br.close();
		bw.flush();
		bw.close();

	}

}

class MyStack {
	class Node {
		private int data;
		private Node next;
	}
	private Node top;
	private int size = 0 ;

	//	
	//	push X: 정수 X를 스택에 넣는 연산이다.
	public void push(int data) {
		Node node = new Node();
		node.data =data;
		node.next = top;
		top = node;
		this.size++;
	}
	//	pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int pop() {
		if(this.size == 0) {
			return -1;
		}
		int temp = top.data;
		top = top.next;
		this.size--;
		return temp;
	}
	//	size: 스택에 들어있는 정수의 개수를 출력한다.
	public int size() {
		return this.size;
	}
	//	empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	public int empty() {
		if(size() == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	//	top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int top() {
		if(size() == 0 ) {
			return -1;
		} 
		return this.top.data;
	}
}