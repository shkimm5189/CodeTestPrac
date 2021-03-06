package number1;
//
//전체 학생의 수는 2명 이상 30명 이하입니다.
//체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
//여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
//여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
//여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
//남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int ans = n - lost.length; //체육복을 읽어 버린 학생
        int exs = 0; // 체육복이 있는 학생
        int bor = 0; // 본인것이 있으면서 빌려준 학생
        for (int i = 0 ; i < lost.length; i++) {
        	for(int j = 0 ; j < reserve.length; j++) {
        		if(lost[i] == reserve[j] ) {
        			exs++;
        			lost[i] = -1;
        			reserve[j] = -1;
        			break;
        		}
        	}
        }
        
        for(int i = 0 ; i < lost.length; i++) {
        	for(int j = 0 ; j < reserve.length; j++) {
        		if(lost[i] == reserve[j]+1 || lost[i] == reserve[j]-1) {
        			bor++;
        			reserve[j] = -1;
        			break;
        		}
        	}

        }
        return ans + exs +bor;
    }
}
