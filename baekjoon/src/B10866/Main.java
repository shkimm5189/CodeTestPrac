package B10866;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//push_front X: 정수 X를 덱의 앞에 넣는다.
//push_back X: 정수 X를 덱의 뒤에 넣는다.
//pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 덱에 들어있는 정수의 개수를 출력한다.
//empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
//front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Dequeue deque = new Dequeue();
		int repeat = Integer.parseInt(br.readLine());


		while(repeat -- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			switch(st.nextToken()) {
			case "push_front":
				deque.push_front(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				deque.push_back(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				bw.write(deque.pop_front()+"\n");

				break;
			case "pop_back":
				bw.write(deque.pop_back()+"\n");

				break;
			case "size":
				bw.write(deque.size()+"\n");

				break;
			case "empty":
				bw.write(deque.empty()+"\n");

				break;
			case "front":
				bw.write(deque.front()+"\n");

				break;
			case "back":
				bw.write(deque.back()+"\n");

				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();

	}
}

class Dequeue{
	class Node{
		int data;
		Node before;
		Node next;
		Node(int data){
			this.data  = data;
		}

	}
	Node front;
	Node back;
	int size;

	//push_front X: 정수 X를 덱의 앞에 넣는다.
	public void push_front(int data) {
		Node newNode = new Node(data);
		if(empty() == 1 ) {
			front = newNode;
			back = newNode;
			newNode.next = null;
			newNode.before = null;
		} else {
			newNode.next = front;
			newNode.before = null;
			front.before = newNode;
			front = newNode;
		}
		size++;
	}

	//push_back X: 정수 X를 덱의 뒤에 넣는다.
	public void push_back(int data) {
		Node newNode = new Node(data);
		if(empty() == 1 ) {
			back = newNode;
			front = newNode;
			newNode.next = null;
			newNode.before = null;
		} else {
			newNode.next = null;
			newNode.before = back;
			back.next = newNode;
			back = newNode;
		}
		size++;
	}

	//pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int pop_front() {
		if(empty() == 1) {
			return -1;
		} else {
			int temp = front.data;
			if(front.next == null) {
				front =null;
				back=null;
			}else {
				front = front.next;
				front.before = null;
			}
			size--;
			return temp;
		}

	}

	//pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int pop_back() {
		if(empty() == 1) {
			return -1;	
		} else { 
			int temp = back.data;
			if(back.before ==null) {
				front = null;
				back = null;
			} else {
				back = back.before;
				back.next = null;
			}
			size--;
			return temp;
		}
	}

	//size: 덱에 들어있는 정수의 개수를 출력한다.
	public int size() {
		if(size <= 0) {
			return 0;
		}
		return size;
	}

	//empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
	public int empty() {
		if(front == null || back == null) {
			return 1;
		} else {
			return 0;
		}
	}

	//front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int front() {
		if(front == null) {
			return  -1;
		} else {
			return front.data;
		}
	}

	//back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public int back() {
		if(back == null) {
			return -1;
		} else {
			return back.data;
		}
	}

}