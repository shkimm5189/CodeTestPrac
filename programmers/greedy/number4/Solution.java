package number4;

import java.util.Arrays;
//people 배열을 정렬해서
//최대값과 최소값들을 비교하면서 사람을 빼도록 한다
class Solution {
    public int solution(int[] people, int limit) {
        int ans = 0 ;
        Arrays.sort(people);
        
        int idx = 0 , i;
        for(i = people.length-1 ; idx < i ; i--) {
        	if(people[idx] + people[i] > limit) {
        		ans++;
        	}else {
        		ans++;
        		idx++;
        	} //if
        	
        }//for
        if(i == idx)
        	ans++;
        
        	
        return ans;
        
    } // solution
}
