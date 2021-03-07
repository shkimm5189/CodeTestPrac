package b1946_신입사원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Score implements Comparable<Score>{
	int docu;
	int inter;
	int total;
	Score(int docu,int inter){
		this.docu = docu;
		this.inter = inter;
		this.total = docu+inter;
	}


	@Override
	public int compareTo(Score s) {

		return this.total - s.total;
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int testCaseN = Integer.parseInt(br.readLine());
		while(testCaseN-- > 0) {
			int sameCnt = 1 ;
			ArrayList<Score> sameList = new ArrayList<Score>();
			ArrayList<Score> subList = null ;
			int N = Integer.parseInt(br.readLine());
			Score[] score = new Score[N];
			int max = N;
			for(int i = 0 ; i < N; i++) {
				st = new StringTokenizer(br.readLine()," ");
				score[i] = new Score(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			}
			Arrays.sort(score);
			// total이 같은 구간이 있는지 확인
			for(int i = 1 ; i < score.length; i++) {
				if(score[i].total ==  score[i-1].total) {
					if(sameList.isEmpty()) {
						sameList.add(score[i-1]);
					}
					if(score[i].total != score[i-1].total && (i+1) < score.length && 
							score[i].total == score[i+1].total) {
						sameList.add(score[i]);
					}
					sameList.add(score[i]);
				}
			}
			if(!sameList.isEmpty()) {
				// total이 같은 구간에서 첫 번째로 등장하는 구간만 필요함
				for(int i = 1 ; i < sameList.size();i++) {
					if( sameList.get(i).total !=sameList.get(i-1).total ) {
						subList = new ArrayList<Score>(sameList.subList(0, i));
						break;
					}
					subList = new ArrayList<Score>(sameList.subList(0, i+1));
				}


				// 잘라낸 리스트에서동률이 있느지  확인;
				Collections.sort(subList,new Comparator<Score>() {
					@Override
					public int compare(Score o1, Score o2) {
						// TODO Auto-generated method stub
						return o1.docu - o2.docu;
					}
				});

				for(int i = 0 ; i <  subList.size()/2; i++) {
					if(subList.get(i).docu == subList.get((subList.size()-1)-i).inter) {
						sameCnt+=2;
					}
				}
			} else {
				System.out.println(1);
				break;
			}

			int result = 0;
			for( int i = 1 ; i <score.length; i++) {
				if(score[i].total == score[i-1].total && score[i].total < score[i+1].total) {
					result = i+1;
				}
			}
			// 마무리
			if(sameCnt == 1) {
				
				
				System.out.println(result - sameCnt);
			} else {
				System.out.println(result);
			}
		}
	}
}
