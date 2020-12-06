package p3;
class Solution {
    public int solution(int money, String[] expected, String[] actual) {
    	int base = 100;
    	
    	for(int i = 0 ; i < actual.length; i++) {
    		if(expected[i].equals(actual[i])) {
    			
    			if(base >= money) {
    				base = money;
    				money+= base;
    				base =100;
    			}else {
    				money += base;
    				base = 100;
    			}
    		} else if(base >= money) {
    			return 0;
    		}else {
    			money -= base;
    			base *= 2;
    		}
    	}
        int answer = money;
        return answer;
    }
}