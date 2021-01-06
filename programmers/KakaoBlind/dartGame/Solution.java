package dartGame;

import java.util.Stack;

class Solution{
    public static int solution(String dartResult) {
    	Stack<Integer> st = new Stack<>();
    	String chk  ="";
    	for(int i =0 ;i<dartResult.length() ; i++) {
    		int c = dartResult.charAt(i);
    		if(c >= '0' && c <= '9') {
                chk += String.valueOf(c);
    			st.push(Integer.parseInt(chk));
    		} else {
    			int tmp = 0;
    			switch(chk) {
    			case "S":
    				chk = "";
    				break;
    			case "D":
    				tmp = (int) Math.pow(st.pop(), 2);
    				st.push(tmp);
    				chk = "";
    				break;
    			case "T":
    				tmp = (int) Math.pow(st.pop(), 3);
    				st.push(tmp);
    				chk = "";
    				break;
    			case "*":
    				int firScore = 0;
    				int secScore = 0;
    				firScore = st.pop() * 2;
    				if(!st.empty()) {
    					
    					secScore = st.pop() * 2;
    					st.push(secScore);
    				}
    				st.push(firScore);
    				break;
    			case "#":
    				tmp = -(st.pop());
    				st.push(tmp);
    				break;
    			}
    		}
    	}
        int answer = 0;
        
        while(!st.empty()) {
        	System.out.println("합 : "+ st.peek());
        	answer += st.pop();
        }
        return answer;
        
    }
    public static void main(String[] args) {
		String dart = "1S*10S*10S*";
		System.out.println(solution(dart));
	}
}

