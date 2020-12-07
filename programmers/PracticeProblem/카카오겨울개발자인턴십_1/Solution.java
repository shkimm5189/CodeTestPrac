package 카카오겨울개발자인턴십_1;

import java.util.Stack;

public class Solution {
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int move = 0;

		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i =0  ; i < moves.length; i++) {
			move = moves[i];
			for(int j = 0 ; j < board.length; j++) {
				if(board[j][move-1] != 0) {
					if(st.peek() == board[j][move-1]) {
						st.pop();
						answer +=2;
					} else {
						st.push(board[j][move-1]);
					}
					board[j][move-1] = 0;
					break;
				}
				
			}
		}
		
		
		return answer;
	}


	public static void main(String[] args) {
		int[][] board  = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(solution(board, moves));
	}
}


