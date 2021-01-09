package 콜라츠추측;
class Solution {
    public int solution(int num) {
        int i = 0;
        while( i < 500) {
        	if(num == 1) {
        		return i;
        	} else if( num % 2 == 0) {
        		num /= 2;
        	} else {
        		num = num * 3 + 1;
        	}
        	i++;
        }
        return -1;
    }
}