package b14891_톱니바퀴;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Deque<Integer> queOne;
	static Deque<Integer> queTwo;
	static Deque<Integer> queThr;
	static Deque<Integer> queFur;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		queOne = new LinkedList<Integer>();
		queTwo = new LinkedList<Integer>();
		queThr = new LinkedList<Integer>();
		queFur = new LinkedList<Integer>();

		String[] input  = br.readLine().split("");
		for(int i = 0 ; i < input.length; i++) {
			queOne.offer(Integer.parseInt(input[i]));
		}

		input  = br.readLine().split("");
		for(int i = 0 ; i < input.length; i++) {
			queTwo.offer(Integer.parseInt(input[i]));
		}

		input  = br.readLine().split("");
		for(int i = 0 ; i < input.length; i++) {
			queThr.offer(Integer.parseInt(input[i]));
		}

		input  = br.readLine().split("");
		for(int i = 0 ; i < input.length; i++) {
			queFur.offer(Integer.parseInt(input[i]));
		}

		int K = Integer.parseInt(br.readLine());

		while(K-- > 0) {
			st = new StringTokenizer(br.readLine()," ");
			int selectQue = Integer.parseInt(st.nextToken());
			int direc = Integer.parseInt(st.nextToken());
			switch(selectQue) {
			case 1:
				oneLogic(direc);
				break;
			case 2:
				twoLogic(direc);
				break;
			case 3:
				thrLogic(direc);
				break;
			case 4:
				FurLogic(direc);
				break;
			}
		}
		int sum = 0;
		sum += (queOne.pollFirst() == 1) ? 1 :0;
		sum += (queTwo.pollFirst() == 1) ? 2 :0;
		sum += (queThr.pollFirst() == 1) ? 4 :0;
		sum += (queFur.pollFirst() == 1) ? 8 :0;
		
		System.out.println(sum);

	}

	static void oneLogic(int direc) {
		Object[] tempOne = queOne.toArray(); 
		Object[] tempTwo = queTwo.toArray();
		Object[] tempThr = queThr.toArray();
		Object[] tempFur = queFur.toArray();
		if(direc == 1) {
			queOne.offerFirst(queOne.pollLast()); // 시계방향
			if(tempOne[6].equals( tempTwo[2])) {
				return;
			} else {
				queTwo.offerLast(queTwo.pollFirst()); // 반시계방향
				if(tempTwo[6].equals(tempThr[2])) {
					return;
				} else {
					queThr.offerFirst(queThr.pollLast()); // 시계방향
					if(tempThr[6].equals( tempFur[2])) {
						return;
					} else {
						queFur.offerLast(queFur.pollFirst()); // 반시계방향
					}
				}
			}
		} else {
			queOne.offerLast(queOne.pollFirst()); // 반시계방향
			if(tempOne[6].equals( tempTwo[2])) {
				return;
			} else {
				queTwo.offerFirst(queTwo.pollLast()); // 시계방향
				if(tempTwo[6].equals(tempThr[2])) {
					return;
				} else {
					queThr.offerLast(queThr.pollFirst()); // 반시계방향
					if(tempThr[6].equals( tempFur[2])) {
						return;
					} else {
						queFur.offerFirst(queFur.pollLast()); // 시계방향
					}
				}
			}
		}
	}
	static void twoLogic(int direc) {
		Object[] tempOne = queOne.toArray(); 
		Object[] tempTwo = queTwo.toArray();
		Object[] tempThr = queThr.toArray();
		Object[] tempFur = queFur.toArray();
		if(direc == 1) {
			queTwo.offerFirst(queTwo.pollLast()); // 시계방향
			if(!(tempTwo[2].equals(tempOne[6]))) {
				queOne.offerLast(queOne.pollFirst()); // 반시계방향
			}
			if(!(tempTwo[6].equals(tempThr[2]))) {
				queThr.offerLast(queThr.pollFirst()); // 반시계방향
				if(!(tempThr[6].equals(tempFur[2]))) {
					queFur.offerFirst(queFur.pollLast()); // 시계방향
				}
			} 
		} else {
			queTwo.offerLast(queTwo.pollFirst()); // 반시계방향
			if(!(tempTwo[2].equals(tempOne[6]))) {
				queOne.offerFirst(queOne.pollLast()); // 시계방향
			}
			if(!(tempTwo[6].equals(tempThr[2]))) {
				queThr.offerFirst(queThr.pollLast()); // 시계방향
				if(!(tempThr[6].equals(tempFur[2]))) {
					queFur.offerLast(queFur.pollFirst()); // 반시계방향
				}
			}
		}
	}
	static void thrLogic(int direc) {
		Object[] tempOne = queOne.toArray(); 
		Object[] tempTwo = queTwo.toArray();
		Object[] tempThr = queThr.toArray();
		Object[] tempFur = queFur.toArray();
		if(direc == 1) {
			queThr.offerFirst(queThr.pollLast()); // 시계방향
			if(!(tempThr[6].equals(tempFur[2]))) {
				queFur.offerLast(queFur.pollFirst()); // 반시계방향
			}
			if(!(tempThr[2].equals(tempTwo[6]))) {
				queTwo.offerLast(queTwo.pollFirst()); // 반시계방향
				if(!(tempTwo[2].equals(tempOne[6]))) {
					queOne.offerFirst(queOne.pollLast()); // 시계방향
				}
			} 
		} else {
			queThr.offerLast(queThr.pollFirst()); // 반시계방향
			if(!(tempThr[6].equals(tempFur[2]))) {
				queFur.offerFirst(queFur.pollLast()); // 시계방향
			}
			if(!(tempThr[2].equals(tempTwo[6]))) {
				queTwo.offerFirst(queTwo.pollLast()); // 시계방향
				if(!(tempTwo[2].equals(tempOne[6]))) {
					queOne.offerLast(queOne.pollFirst()); // 반시계방향
				}
			}
		}
	}
	static void FurLogic(int direc) {
		Object[] tempOne = queOne.toArray(); 
		Object[] tempTwo = queTwo.toArray();
		Object[] tempThr = queThr.toArray();
		Object[] tempFur = queFur.toArray();
		if(direc == 1) {
			queFur.offerFirst(queFur.pollLast()); // 시계방향
			if(tempFur[2].equals( tempThr[6])) {
				return;
			} else {
				queThr.offerLast(queThr.pollFirst()); // 반시계방향
				if(tempThr[2].equals(tempTwo[6])) {
					return;
				} else {
					queTwo.offerFirst(queTwo.pollLast()); // 시계방향
					if(tempTwo[2].equals(tempOne[6])) {
						return;
					} else {
						queOne.offerLast(queOne.pollFirst()); // 반시계방향
					}
				}
			}
		} else {
			queFur.offerLast(queFur.pollFirst()); // 반시계방향

			if(tempFur[2].equals( tempThr[6])) {
				return;
			} else {
				
				queThr.offerFirst(queThr.pollLast()); // 시계방향
				if(tempThr[2].equals( tempTwo[6])) {
					return;
				} else {
					queTwo.offerLast(queTwo.pollFirst()); // 반시계방향
					if(tempTwo[2].equals( tempOne[6]) ){
						return;
					} else {
						queOne.offerFirst(queOne.pollLast()); // 시계방향
					}
				}
			}
		}
	}
}
