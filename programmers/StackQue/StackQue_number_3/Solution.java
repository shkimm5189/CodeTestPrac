package StackQue_number_3;

import java.util.LinkedList;
import java.util.Queue;

//
//트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
//※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
//
//예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
//
//경과 시간	다리를 지난 트럭	다리를 건너는 트럭	대기 트럭
//0	[]	[]	[7,4,5,6]
//1~2	[]	[7]	[4,5,6]
//3	[7]	[4]	[5,6]
//4	[7]	[4,5]	[6]
//5	[7,4]	[5]	[6]
//6~7	[7,4,5]	[6]	[]
//8	[7,4,5,6]	[]	[]
//따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.
//
//solution 함수의 매개변수로 다리 길이 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
//
//제한 조건
//bridge_length는 1 이상 10,000 이하입니다.
//weight는 1 이상 10,000 이하입니다.
//truck_weights의 길이는 1 이상 10,000 이하입니다.
//모든 트럭의 무게는 1 이상 weight 이하입니다.

public class Solution {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> que = new LinkedList<>();
		
		int sum=0;
		int idx=0; 
		int answer = 0;
		while(true) {
			answer++;
			if(que.isEmpty() ) { //다리가 비었을때
				que.offer(truck_weights[idx]);
				sum += truck_weights[idx];
				idx++;
			} else if(que.size() == bridge_length) {	//다리가 꽉찻을때
				sum -= que.poll();
			} else {	
				if(sum + idx > weight) {
					que.offer(0);
					
				} else {
					que.offer(truck_weights[idx]);
					sum += truck_weights[idx];
					idx++;
				}
			}
			if(idx == truck_weights.length)
				break;
		}
		return answer;
	}
}