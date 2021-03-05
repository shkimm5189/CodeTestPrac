package b1946_신입사원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
	
	public int sum() {
		return this.docu + this.inter;
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
			int N = Integer.parseInt(br.readLine());
			Score[] score = new Score[N];
			for(int i = 0 ; i < N; i++) {
				st = new StringTokenizer(br.readLine()," ");
				score[i] = new Score(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			}
			Arrays.sort(score);
			
			for(int i = 0 ; i < score.length; i++) {
				System.out.println(score[i].docu+" "+score[i].inter);
			}
		}
		
	}
}
