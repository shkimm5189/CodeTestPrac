package number2;

class Solution {
    public String solution(String number, int k) {
        
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        char max;
        
        int n = number.length() - k;
        
        for(int i = 0 ; i < n; i++) {  //필요한 자릿수만큼반복 실행
        	max = '0';
        	for(int j = idx; j <= k + i ;j++ ) {		//
        		if(max < number.charAt(j)) {
        			max = number.charAt(j);
                    idx = j+1;
        		}
        	}
            sb.append(max);
            
        }
        
        return sb.toString();
    }
}