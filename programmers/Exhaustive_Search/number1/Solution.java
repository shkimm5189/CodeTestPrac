package number1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int[] solution(int[] answers) {
        int[] answer = {};
        int[] ans = {0,0,0};
        int[] stu1 = {1,2,3,4,5};
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
        
        
        int s1=0;
        int s2=0;
        int s3=0;
        
        
        for(int i =0  ; i < answers.length; i++ ) {
        	//stu1
        	if(answers[i] == stu1[s1]) {
        		ans[0]++;
        	}
        	s1++;
        	if(s1 == stu1.length) {
        		s1=0;
        	}
        	
        	//stu2
        	if(answers[i] == stu2[s2]) {
        		ans[1]++;
        	}
        	s2++;
        	if(s2 == stu2.length) {
        		s2=0;
        	}
        	
        	//stu3
        	if(answers[i] == stu3[s3]) {
        		ans[2]++;
        	}
        	s3++;
        	if(s3 == stu3.length) {
        		s3=0;
        	}
        }
        int max = Math.max(ans[0],Math.max(ans[1],ans[2]));

        ArrayList<Integer> stu = new ArrayList<Integer>();

        if(max == ans[0]) {
        	stu.add(1);
        }
        if(max == ans[1]) {
        	stu.add(2);
        }
        if(max == ans[2]) {
        	stu.add(3);
        }
        answer = new int[stu.size()];
        for(int i= 0 ;i<answer.length;i++) {
        	answer[i] = stu.get(i);
        }
        return answer;
        
    }
}