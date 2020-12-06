package p1;

import java.util.HashMap;

class Solution {
    public int solution(String[] grades, int[] weights, int threshold) {
        HashMap<String, Integer> hash = new HashMap<>();
        int answer = 0 ;
        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        int[] score = {10,9,8,7,6,5,4,3,0};
        for(int i =0 ; i< grade.length ;i++ ) {
        	hash.put(grade[i],score[i] );
        }
        
        for(int i = 0 ; i < grades.length; i++) {
        	answer += hash.get(grades[i]) * weights[i];
        }
        
       
        
        return answer-threshold;
    }
}