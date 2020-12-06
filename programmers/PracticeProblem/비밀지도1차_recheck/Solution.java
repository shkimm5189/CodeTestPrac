package 비밀지도1차_recheck;


public class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
       
        
        for(int i = 0 ; i < arr1.length; i++) {
        	String str = changeStr(Integer.toBinaryString(arr1[i]|arr2[i]), n);
        	char[] ch = str.toCharArray();
        	for(int j = 0 ; j < ch.length; j++) {
        		if(ch[j] =='1') {
        			ch[j] = '#';
        		} else {
        			ch[j] = ' ';
        		}
        		
        	}
        	answer[i] = String.valueOf(ch);
        }
        
        return answer;
    }
    public static String changeStr(String str ,int n) {
    	for(int i = str.length() ; i < n; i++) {
    		str = "0" + str;
    	}
    	return str;
    }
  
//    public static void main(String[] args) {
//    	int[] a = {1, 1, 28, 18, 11};
//    	int[] b = {30, 1, 21, 17, 28};
//		System.out.println(solution(5, a, b));
//	}
}
